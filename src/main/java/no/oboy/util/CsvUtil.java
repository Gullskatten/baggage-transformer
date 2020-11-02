package no.oboy.util;

import com.google.common.base.Charsets;
import com.opencsv.CSVWriter;
import com.opencsv.bean.*;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import no.oboy.model.AirportIATACode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvUtil<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CsvUtil.class);

    public void writeCsv(List<T> records, File outputFile) {

        LOGGER.info("Writing output CSV file {} to {}", outputFile.getName(), outputFile.getAbsolutePath());

        try(FileWriter writer = new FileWriter(outputFile)) {
            StatefulBeanToCsv<T> sbc = new StatefulBeanToCsvBuilder<T>(writer)
                    .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                    .build();
            sbc.write(records);
        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            LOGGER.error("Failed to write output file: {}", e.getMessage());
        }
    }

    public List<T> readCsv(String resourceFileName, Class typeOfObjects, String delimiter, Charset charset) {
        LOGGER.info("Reading file from src/main/resources/{}", resourceFileName);
        if(!resourceFileName.startsWith("/")) {
            LOGGER.debug("Appending / to resource filename");
            resourceFileName = "/" + resourceFileName;
        }

        try(BufferedReader reader = Files.newBufferedReader(Path.of(this.getClass().getResource(resourceFileName).getPath()), charset)) {

            CsvToBean<T> cb = new CsvToBeanBuilder<T>(reader)
                    .withSeparator(delimiter.charAt(0))
                    .withType(typeOfObjects)
                    .withSkipLines(1)
                    .build();
            LOGGER.debug("Parsing file content to CSV");
            return cb.parse();
        } catch (Exception e) {
            LOGGER.error("Reading of CSV file failed: {}", e.getMessage());
        }
        return null;
    }

    public List<AirportIATACode> readAirportCodesAsRaw(String resourceFileName) {
        LOGGER.info("Reading file (raw) from src/main/resources/{}", resourceFileName);
        if(!resourceFileName.startsWith("/")) {
            LOGGER.debug("Appending / to resource filename");
            resourceFileName = "/" + resourceFileName;
        }

        try(BufferedReader reader = Files.newBufferedReader(Path.of(this.getClass().getResource(resourceFileName).getPath()), Charsets.UTF_16)) {
            reader.lines().forEach(line -> {
                LOGGER.debug(line);
            });
        } catch (Exception e) {
            LOGGER.error("Reading of CSV file failed: {}", e.getMessage());
        }

        return null;
    }
}
