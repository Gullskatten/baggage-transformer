package no.oboy;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import no.oboy.constants.AllCsvFilesList;
import no.oboy.filter.*;
import no.oboy.model.AirportIATACode;
import no.oboy.model.BaggageRecord;
import no.oboy.model.BaggageRecordOutput;
import no.oboy.util.CsvUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static final String CSV_FILE_ENDING = ".csv";
    public static final String BAGGAGE_RECORDS_POSTFIX = "baggage_records";

    public static void main(String[] args) {
        CsvUtil<BaggageRecord> baggageCsvUtil = new CsvUtil<>();
        CsvUtil<AirportIATACode> airportLocationsCsvUtil = new CsvUtil<>();
        FilterExecutor filterExecutor = new FilterExecutor()
                .addFilter(LongDistanceFlights.class)
                .addFilter(FromNorwegianAirportOnly.class)
                .addFilter(SingleBagEventMessagesOnly.class)
                .addFilter(NoBsmDeletedMessages.class);

        LOGGER.info("Initialized FilterExecutor with {} filters", filterExecutor.getFilterCount());

        List<BaggageRecordOutput> filteredRecords = new ArrayList<>();

        LOGGER.info("Reading AirportIATACodes from /src/resources");
        final List<AirportIATACode> airportIATACodes = airportLocationsCsvUtil.readCsv(AllCsvFilesList.IATA_CODE_FILE, AirportIATACode.class, ";", Charsets.UTF_16);

        if(airportIATACodes == null || airportIATACodes.isEmpty()) {
            LOGGER.error("No airport codes were not found, make sure that the file exists!");
            return;
        }

        LOGGER.info("Reading baggage record files from /src/resources");
        AllCsvFilesList.CSV_TEST_FILES.forEach(fileInResourcesFolder -> {
            List<BaggageRecord> allRecordsFromCsv = baggageCsvUtil.readCsv(fileInResourcesFolder, BaggageRecord.class, ",", Charsets.UTF_8);

            if (allRecordsFromCsv == null) {
                LOGGER.warn("Skipping file {}", fileInResourcesFolder);
                return;
            }

            ExecutorService threadPoolExecutor = Executors.newWorkStealingPool();
            LOGGER.info("Initialized thread pool, preparing parallel execution of filters");
            List<Callable<List<BaggageRecordOutput>>> workLoad = Lists.partition(allRecordsFromCsv, 500).stream().map(listOfRecords ->
                    (Callable<List<BaggageRecordOutput>>) () -> {
                        List<BaggageRecord> includedItems = new ArrayList<>();
                        listOfRecords.forEach(record -> filterExecutor.executeRules(includedItems, record));
                        return includedItems.stream().map(item -> Main.toOutputRecordsWithLocations(item, airportIATACodes)).collect(Collectors.toList());
                    }
            ).collect(Collectors.toList());

            LOGGER.info("Performing parallel execution of filters with {} workers", workLoad.size());
            try {
                threadPoolExecutor.invokeAll(workLoad).forEach(listFuture -> {
                    try {
                        filteredRecords.addAll(listFuture.get());
                    } catch (InterruptedException | ExecutionException e) {
                        LOGGER.error("Error during rule invocation: {}", e.getMessage());
                    }
                });
            } catch (InterruptedException e) {
                LOGGER.error("Thread was interrupted: {}", e.getMessage());
            }
        });

        LOGGER.info("Execution of filters on all files complete");
        if (filteredRecords.isEmpty()) {
            LOGGER.warn("No baggage records exists after filtering. Check the filters you have applied and try again!");
            LOGGER.warn("Output file was not created");
        } else {
            File file = new File(System.currentTimeMillis() + "_" + BAGGAGE_RECORDS_POSTFIX + CSV_FILE_ENDING);
            CsvUtil<BaggageRecordOutput> csvUtilForTransformedRecords = new CsvUtil<>();
            csvUtilForTransformedRecords.writeCsv(filteredRecords, file);
        }
    }

    private static BaggageRecordOutput toOutputRecordsWithLocations(BaggageRecord aRecord, List<AirportIATACode> airportIATACodes) {
        BaggageRecordOutput baggageRecordOutput = BaggageRecordOutput.from(aRecord);
        
        if(baggageRecordOutput.getLeg0DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg0DepartureAirportIATA())).findFirst();
            
            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat0Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng0Departure(matchingAirport.get().getLng());
                
            }
        }

        if(baggageRecordOutput.getLeg0ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg0ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat0Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng0Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg1DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg1DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat1Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng1Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg1ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg1ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat1Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng1Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg2DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg2DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat2Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng2Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg2ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg2ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat2Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng2Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg3DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg3DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat3Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng3Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg3ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg3ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat3Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng3Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg4DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg4DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat4Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng4Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg4ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg4ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat4Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng4Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg5DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg5DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat5Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng5Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg5ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg5ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat5Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng5Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg6DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg6DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat6Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng6Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg6ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg6ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat6Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng6Arrival(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg7DepartureAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg7DepartureAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat7Departure(matchingAirport.get().getLat());
                baggageRecordOutput.setLng7Departure(matchingAirport.get().getLng());

            }
        }

        if(baggageRecordOutput.getLeg7ArrivalAirportIATA() != null) {
            Optional<AirportIATACode> matchingAirport = airportIATACodes.stream().filter(codes -> codes.getIataCode().equals(baggageRecordOutput.getLeg7ArrivalAirportIATA())).findFirst();

            if(matchingAirport.isPresent()) {
                baggageRecordOutput.setLat7Arrival(matchingAirport.get().getLat());
                baggageRecordOutput.setLng7Arrival(matchingAirport.get().getLng());

            }
        }
        return baggageRecordOutput;
    }
}
