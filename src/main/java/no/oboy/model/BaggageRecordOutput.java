package no.oboy.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BaggageRecordOutput {

    @CsvBindByName(column = "id")
    String id;
    @CsvBindByName(column = "sourceTimestamp")
    LocalDateTime sourceTimestamp;
    @CsvBindByName(column = "bagTagNumber")
    String bagTagNumber;
    @CsvBindByName(column = "bagEventCode")
    BagEventCode bagEventCode;
    @CsvBindByName(column = "bagEventTimestamp")
    LocalDateTime bagEventTimestamp;
    @CsvBindByName(column = "bagEventAirportIATA")
    String bagEventAirportIATA;
    @CsvBindByName(column = "bagEventDescription")
    BagEventDescription bagEventDescription;
    @CsvBindByName(column = "bagFinalAirportIATA")
    String bagFinalAirportIATA;
    @CsvBindByName(column = "legArrayLength")
    int legArrayLength;
    @CsvBindByName(column = "leg0DepartureAirportIATA")
    String leg0DepartureAirportIATA;
    @CsvBindByName(column = "leg0ArrivalAirportIATA")
    String leg0ArrivalAirportIATA;
    @CsvBindByName(column = "leg0FlightId")
    String leg0FlightId;
    @CsvBindByName(column = "leg0Sobt")
    LocalDateTime leg0Sobt;
    @CsvBindByName(column = "leg1DepartureAirportIATA")
    String leg1DepartureAirportIATA;
    @CsvBindByName(column = "leg1ArrivalAirportIATA")
    String leg1ArrivalAirportIATA;
    @CsvBindByName(column = "leg1FlightId")
    String leg1FlightId;
    @CsvBindByName(column = "leg1Sobt")
    LocalDateTime leg1Sobt;
    @CsvBindByName(column = "leg2DepartureAirportIATA")
    String leg2DepartureAirportIATA;
    @CsvBindByName(column = "leg2ArrivalAirportIATA")
    String leg2ArrivalAirportIATA;
    @CsvBindByName(column = "leg2FlightId")
    String leg2FlightId;
    @CsvBindByName(column = "leg2Sobt")
    LocalDateTime leg2Sobt;
    @CsvBindByName(column = "leg3DepartureAirportIATA")
    String leg3DepartureAirportIATA;
    @CsvBindByName(column = "leg3ArrivalAirportIATA")
    String leg3ArrivalAirportIATA;
    @CsvBindByName(column = "leg3FlightId")
    String leg3FlightId;
    @CsvBindByName(column = "leg3Sobt")
    LocalDateTime leg3Sobt;
    @CsvBindByName(column = "leg4DepartureAirportIATA")
    String leg4DepartureAirportIATA;
    @CsvBindByName(column = "leg4ArrivalAirportIATA")
    String leg4ArrivalAirportIATA;
    @CsvBindByName(column = "leg4FlightId")
    String leg4FlightId;
    @CsvBindByName(column = "leg4Sobt")
    LocalDateTime leg4Sobt;
    @CsvBindByName(column = "leg5DepartureAirportIATA")
    String leg5DepartureAirportIATA;
    @CsvBindByName(column = "leg5ArrivalAirportIATA")
    String leg5ArrivalAirportIATA;
    @CsvBindByName(column = "leg5FlightId")
    String leg5FlightId;
    @CsvBindByName(column = "leg5Sobt")
    LocalDateTime leg5Sobt;
    @CsvBindByName(column = "leg6DepartureAirportIATA")
    String leg6DepartureAirportIATA;
    @CsvBindByName(column = "leg6ArrivalAirportIATA")
    String leg6ArrivalAirportIATA;
    @CsvBindByName(column = "leg6FlightId")
    String leg6FlightId;
    @CsvBindByName(column = "leg6Sobt")
    LocalDateTime leg6Sobt;
    @CsvBindByName(column = "leg7DepartureAirportIATA")
    String leg7DepartureAirportIATA;
    @CsvBindByName(column = "leg7ArrivalAirportIATA")
    String leg7ArrivalAirportIATA;
    @CsvBindByName(column = "leg7FlightId")
    String leg7FlightId;
    @CsvBindByName(column = "leg7Sobt")
    LocalDateTime leg7Sobt;
    @CsvBindByName(column = "leg0_dep_lat")
    private Double lat0Departure;
    @CsvBindByName(column = "leg0_dep_lng")
    private Double lng0Departure;
    @CsvBindByName(column = "leg0_arr_lat")
    private Double lat0Arrival;
    @CsvBindByName(column = "leg0_arr_lng")
    private Double lng0Arrival;
    @CsvBindByName(column = "leg1_dep_lat")
    private Double lat1Departure;
    @CsvBindByName(column = "leg1_dep_lng")
    private Double lng1Departure;
    @CsvBindByName(column = "leg1_arr_lat")
    private Double lat1Arrival;
    @CsvBindByName(column = "leg1_arr_lng")
    private Double lng1Arrival;
    @CsvBindByName(column = "leg2_dep_lat")
    private Double lat2Departure;
    @CsvBindByName(column = "leg2_dep_lng")
    private Double lng2Departure;
    @CsvBindByName(column = "leg2_arr_lat")
    private Double lat2Arrival;
    @CsvBindByName(column = "leg2_arr_lng")
    private Double lng2Arrival;
    @CsvBindByName(column = "leg3_dep_lat")
    private Double lat3Departure;
    @CsvBindByName(column = "leg3_dep_lng")
    private Double lng3Departure;
    @CsvBindByName(column = "leg3_arr_lat")
    private Double lat3Arrival;
    @CsvBindByName(column = "leg3_arr_lng")
    private Double lng3Arrival;
    @CsvBindByName(column = "leg4_dep_lat")
    private Double lat4Departure;
    @CsvBindByName(column = "leg4_dep_lng")
    private Double lng4Departure;
    @CsvBindByName(column = "leg4_arr_lat")
    private Double lat4Arrival;
    @CsvBindByName(column = "leg4_arr_lng")
    private Double lng4Arrival;
    @CsvBindByName(column = "leg5_dep_lat")
    private Double lat5Departure;
    @CsvBindByName(column = "leg5_dep_lng")
    private Double lng5Departure;
    @CsvBindByName(column = "leg5_arr_lat")
    private Double lat5Arrival;
    @CsvBindByName(column = "leg5_arr_lng")
    private Double lng5Arrival;
    @CsvBindByName(column = "leg6_dep_lat")
    private Double lat6Departure;
    @CsvBindByName(column = "leg6_dep_lng")
    private Double lng6Departure;
    @CsvBindByName(column = "leg6_arr_lat")
    private Double lat6Arrival;
    @CsvBindByName(column = "leg6_arr_lng")
    private Double lng6Arrival;
    @CsvBindByName(column = "leg7_dep_lat")
    private Double lat7Departure;
    @CsvBindByName(column = "leg7_dep_lng")
    private Double lng7Departure;
    @CsvBindByName(column = "leg7_arr_lat")
    private Double lat7Arrival;
    @CsvBindByName(column = "leg7_arr_lng")
    private Double lng7Arrival;
    @CsvBindByName(column = "bagPnrCode")
    String bagPnrCode;

    public BaggageRecordOutput() {

    }

    public static BaggageRecordOutput from(BaggageRecord aRecord) {
        BaggageRecordOutput baggageRecordOutput = new BaggageRecordOutput();

        baggageRecordOutput.setId(String.valueOf(aRecord.getBagTagNumber().hashCode()
                + aRecord.getSourceTimestamp().getYear()
                + aRecord.getSourceTimestamp().getMonthValue())
                + aRecord.getSourceTimestamp().getDayOfMonth()
        );
        baggageRecordOutput.setBagPnrCode(aRecord.getBagPnrCode());
        baggageRecordOutput.setSourceTimestamp(aRecord.sourceTimestamp);
        baggageRecordOutput.setBagTagNumber(aRecord.bagTagNumber);
        baggageRecordOutput.setBagEventCode(aRecord.bagEventCode);
        baggageRecordOutput.setBagEventTimestamp(aRecord.bagEventTimestamp);
        baggageRecordOutput.setBagEventAirportIATA(aRecord.bagEventAirportIATA);
        baggageRecordOutput.setBagEventDescription(aRecord.bagEventDescription);
        baggageRecordOutput.setBagFinalAirportIATA(aRecord.bagFinalAirportIATA);
        baggageRecordOutput.setLegArrayLength(aRecord.legArrayLength);
        baggageRecordOutput.setLeg0ArrivalAirportIATA(aRecord.leg0ArrivalAirportIATA);
        baggageRecordOutput.setLeg0DepartureAirportIATA(aRecord.leg0DepartureAirportIATA);
        baggageRecordOutput.setLeg0FlightId(aRecord.leg0FlightId);
        baggageRecordOutput.setLeg0Sobt(aRecord.leg0Sobt);
        baggageRecordOutput.setLeg1ArrivalAirportIATA(aRecord.leg1ArrivalAirportIATA);
        baggageRecordOutput.setLeg1DepartureAirportIATA(aRecord.leg1DepartureAirportIATA);
        baggageRecordOutput.setLeg1FlightId(aRecord.leg1FlightId);
        baggageRecordOutput.setLeg1Sobt(aRecord.leg1Sobt);
        baggageRecordOutput.setLeg2ArrivalAirportIATA(aRecord.leg2ArrivalAirportIATA);
        baggageRecordOutput.setLeg2DepartureAirportIATA(aRecord.leg2DepartureAirportIATA);
        baggageRecordOutput.setLeg2FlightId(aRecord.leg2FlightId);
        baggageRecordOutput.setLeg2Sobt(aRecord.leg2Sobt);
        baggageRecordOutput.setLeg3ArrivalAirportIATA(aRecord.leg3ArrivalAirportIATA);
        baggageRecordOutput.setLeg3DepartureAirportIATA(aRecord.leg3DepartureAirportIATA);
        baggageRecordOutput.setLeg3FlightId(aRecord.leg3FlightId);
        baggageRecordOutput.setLeg3Sobt(aRecord.leg3Sobt);
        baggageRecordOutput.setLeg4ArrivalAirportIATA(aRecord.leg4ArrivalAirportIATA);
        baggageRecordOutput.setLeg4DepartureAirportIATA(aRecord.leg4DepartureAirportIATA);
        baggageRecordOutput.setLeg4FlightId(aRecord.leg4FlightId);
        baggageRecordOutput.setLeg4Sobt(aRecord.leg4Sobt);
        baggageRecordOutput.setLeg5ArrivalAirportIATA(aRecord.leg5ArrivalAirportIATA);
        baggageRecordOutput.setLeg5DepartureAirportIATA(aRecord.leg5DepartureAirportIATA);
        baggageRecordOutput.setLeg5FlightId(aRecord.leg5FlightId);
        baggageRecordOutput.setLeg5Sobt(aRecord.leg5Sobt);
        baggageRecordOutput.setLeg6ArrivalAirportIATA(aRecord.leg6ArrivalAirportIATA);
        baggageRecordOutput.setLeg6DepartureAirportIATA(aRecord.leg6DepartureAirportIATA);
        baggageRecordOutput.setLeg6FlightId(aRecord.leg6FlightId);
        baggageRecordOutput.setLeg6Sobt(aRecord.leg6Sobt);
        baggageRecordOutput.setLeg7ArrivalAirportIATA(aRecord.leg7ArrivalAirportIATA);
        baggageRecordOutput.setLeg7DepartureAirportIATA(aRecord.leg7DepartureAirportIATA);
        baggageRecordOutput.setLeg7FlightId(aRecord.leg7FlightId);
        baggageRecordOutput.setLeg7Sobt(aRecord.leg7Sobt);
        return baggageRecordOutput;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLat0Departure() {
        return lat0Departure;
    }

    public LocalDateTime getSourceTimestamp() {
        return sourceTimestamp;
    }

    public void setSourceTimestamp(LocalDateTime sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    public String getBagTagNumber() {
        return bagTagNumber;
    }

    public void setBagTagNumber(String bagTagNumber) {
        this.bagTagNumber = bagTagNumber;
    }

    public BagEventCode getBagEventCode() {
        return bagEventCode;
    }

    public void setBagEventCode(BagEventCode bagEventCode) {
        this.bagEventCode = bagEventCode;
    }

    public LocalDateTime getBagEventTimestamp() {
        return bagEventTimestamp;
    }

    public void setBagEventTimestamp(LocalDateTime bagEventTimestamp) {
        this.bagEventTimestamp = bagEventTimestamp;
    }

    public String getBagEventAirportIATA() {
        return bagEventAirportIATA;
    }

    public void setBagEventAirportIATA(String bagEventAirportIATA) {
        this.bagEventAirportIATA = bagEventAirportIATA;
    }

    public BagEventDescription getBagEventDescription() {
        return bagEventDescription;
    }

    public void setBagEventDescription(BagEventDescription bagEventDescription) {
        this.bagEventDescription = bagEventDescription;
    }

    public String getBagFinalAirportIATA() {
        return bagFinalAirportIATA;
    }

    public void setBagFinalAirportIATA(String bagFinalAirportIATA) {
        this.bagFinalAirportIATA = bagFinalAirportIATA;
    }

    public int getLegArrayLength() {
        return legArrayLength;
    }

    public void setLegArrayLength(int legArrayLength) {
        this.legArrayLength = legArrayLength;
    }

    public String getLeg0DepartureAirportIATA() {
        return leg0DepartureAirportIATA;
    }

    public void setLeg0DepartureAirportIATA(String leg0DepartureAirportIATA) {
        this.leg0DepartureAirportIATA = leg0DepartureAirportIATA;
    }

    public String getLeg0ArrivalAirportIATA() {
        return leg0ArrivalAirportIATA;
    }

    public void setLeg0ArrivalAirportIATA(String leg0ArrivalAirportIATA) {
        this.leg0ArrivalAirportIATA = leg0ArrivalAirportIATA;
    }

    public String getLeg0FlightId() {
        return leg0FlightId;
    }

    public void setLeg0FlightId(String leg0FlightId) {
        this.leg0FlightId = leg0FlightId;
    }

    public LocalDateTime getLeg0Sobt() {
        return leg0Sobt;
    }

    public void setLeg0Sobt(LocalDateTime leg0Sobt) {
        this.leg0Sobt = leg0Sobt;
    }

    public String getLeg1DepartureAirportIATA() {
        return leg1DepartureAirportIATA;
    }

    public void setLeg1DepartureAirportIATA(String leg1DepartureAirportIATA) {
        this.leg1DepartureAirportIATA = leg1DepartureAirportIATA;
    }

    public String getLeg1ArrivalAirportIATA() {
        return leg1ArrivalAirportIATA;
    }

    public void setLeg1ArrivalAirportIATA(String leg1ArrivalAirportIATA) {
        this.leg1ArrivalAirportIATA = leg1ArrivalAirportIATA;
    }

    public String getLeg1FlightId() {
        return leg1FlightId;
    }

    public void setLeg1FlightId(String leg1FlightId) {
        this.leg1FlightId = leg1FlightId;
    }

    public LocalDateTime getLeg1Sobt() {
        return leg1Sobt;
    }

    public void setLeg1Sobt(LocalDateTime leg1Sobt) {
        this.leg1Sobt = leg1Sobt;
    }

    public String getLeg2DepartureAirportIATA() {
        return leg2DepartureAirportIATA;
    }

    public void setLeg2DepartureAirportIATA(String leg2DepartureAirportIATA) {
        this.leg2DepartureAirportIATA = leg2DepartureAirportIATA;
    }

    public String getLeg2ArrivalAirportIATA() {
        return leg2ArrivalAirportIATA;
    }

    public void setLeg2ArrivalAirportIATA(String leg2ArrivalAirportIATA) {
        this.leg2ArrivalAirportIATA = leg2ArrivalAirportIATA;
    }

    public String getLeg2FlightId() {
        return leg2FlightId;
    }

    public void setLeg2FlightId(String leg2FlightId) {
        this.leg2FlightId = leg2FlightId;
    }

    public LocalDateTime getLeg2Sobt() {
        return leg2Sobt;
    }

    public void setLeg2Sobt(LocalDateTime leg2Sobt) {
        this.leg2Sobt = leg2Sobt;
    }

    public String getLeg3DepartureAirportIATA() {
        return leg3DepartureAirportIATA;
    }

    public void setLeg3DepartureAirportIATA(String leg3DepartureAirportIATA) {
        this.leg3DepartureAirportIATA = leg3DepartureAirportIATA;
    }

    public String getLeg3ArrivalAirportIATA() {
        return leg3ArrivalAirportIATA;
    }

    public void setLeg3ArrivalAirportIATA(String leg3ArrivalAirportIATA) {
        this.leg3ArrivalAirportIATA = leg3ArrivalAirportIATA;
    }

    public String getLeg3FlightId() {
        return leg3FlightId;
    }

    public void setLeg3FlightId(String leg3FlightId) {
        this.leg3FlightId = leg3FlightId;
    }

    public LocalDateTime getLeg3Sobt() {
        return leg3Sobt;
    }

    public void setLeg3Sobt(LocalDateTime leg3Sobt) {
        this.leg3Sobt = leg3Sobt;
    }

    public String getLeg4DepartureAirportIATA() {
        return leg4DepartureAirportIATA;
    }

    public void setLeg4DepartureAirportIATA(String leg4DepartureAirportIATA) {
        this.leg4DepartureAirportIATA = leg4DepartureAirportIATA;
    }

    public String getLeg4ArrivalAirportIATA() {
        return leg4ArrivalAirportIATA;
    }

    public void setLeg4ArrivalAirportIATA(String leg4ArrivalAirportIATA) {
        this.leg4ArrivalAirportIATA = leg4ArrivalAirportIATA;
    }

    public String getLeg4FlightId() {
        return leg4FlightId;
    }

    public void setLeg4FlightId(String leg4FlightId) {
        this.leg4FlightId = leg4FlightId;
    }

    public LocalDateTime getLeg4Sobt() {
        return leg4Sobt;
    }

    public void setLeg4Sobt(LocalDateTime leg4Sobt) {
        this.leg4Sobt = leg4Sobt;
    }

    public String getLeg5DepartureAirportIATA() {
        return leg5DepartureAirportIATA;
    }

    public void setLeg5DepartureAirportIATA(String leg5DepartureAirportIATA) {
        this.leg5DepartureAirportIATA = leg5DepartureAirportIATA;
    }

    public String getLeg5ArrivalAirportIATA() {
        return leg5ArrivalAirportIATA;
    }

    public void setLeg5ArrivalAirportIATA(String leg5ArrivalAirportIATA) {
        this.leg5ArrivalAirportIATA = leg5ArrivalAirportIATA;
    }

    public String getLeg5FlightId() {
        return leg5FlightId;
    }

    public void setLeg5FlightId(String leg5FlightId) {
        this.leg5FlightId = leg5FlightId;
    }

    public LocalDateTime getLeg5Sobt() {
        return leg5Sobt;
    }

    public void setLeg5Sobt(LocalDateTime leg5Sobt) {
        this.leg5Sobt = leg5Sobt;
    }

    public String getLeg6DepartureAirportIATA() {
        return leg6DepartureAirportIATA;
    }

    public void setLeg6DepartureAirportIATA(String leg6DepartureAirportIATA) {
        this.leg6DepartureAirportIATA = leg6DepartureAirportIATA;
    }

    public String getLeg6ArrivalAirportIATA() {
        return leg6ArrivalAirportIATA;
    }

    public void setLeg6ArrivalAirportIATA(String leg6ArrivalAirportIATA) {
        this.leg6ArrivalAirportIATA = leg6ArrivalAirportIATA;
    }

    public String getLeg6FlightId() {
        return leg6FlightId;
    }

    public void setLeg6FlightId(String leg6FlightId) {
        this.leg6FlightId = leg6FlightId;
    }

    public LocalDateTime getLeg6Sobt() {
        return leg6Sobt;
    }

    public void setLeg6Sobt(LocalDateTime leg6Sobt) {
        this.leg6Sobt = leg6Sobt;
    }

    public String getLeg7DepartureAirportIATA() {
        return leg7DepartureAirportIATA;
    }

    public void setLeg7DepartureAirportIATA(String leg7DepartureAirportIATA) {
        this.leg7DepartureAirportIATA = leg7DepartureAirportIATA;
    }

    public String getLeg7ArrivalAirportIATA() {
        return leg7ArrivalAirportIATA;
    }

    public void setLeg7ArrivalAirportIATA(String leg7ArrivalAirportIATA) {
        this.leg7ArrivalAirportIATA = leg7ArrivalAirportIATA;
    }

    public String getLeg7FlightId() {
        return leg7FlightId;
    }

    public void setLeg7FlightId(String leg7FlightId) {
        this.leg7FlightId = leg7FlightId;
    }

    public LocalDateTime getLeg7Sobt() {
        return leg7Sobt;
    }

    public void setLeg7Sobt(LocalDateTime leg7Sobt) {
        this.leg7Sobt = leg7Sobt;
    }

    public void setLat0Departure(Double lat0Departure) {
        this.lat0Departure = lat0Departure;
    }

    public Double getLng0Departure() {
        return lng0Departure;
    }

    public void setLng0Departure(Double lng0Departure) {
        this.lng0Departure = lng0Departure;
    }

    public Double getLat0Arrival() {
        return lat0Arrival;
    }

    public void setLat0Arrival(Double lat0Arrival) {
        this.lat0Arrival = lat0Arrival;
    }

    public Double getLng0Arrival() {
        return lng0Arrival;
    }

    public void setLng0Arrival(Double lng0Arrival) {
        this.lng0Arrival = lng0Arrival;
    }

    public Double getLat1Departure() {
        return lat1Departure;
    }

    public void setLat1Departure(Double lat1Departure) {
        this.lat1Departure = lat1Departure;
    }

    public Double getLng1Departure() {
        return lng1Departure;
    }

    public void setLng1Departure(Double lng1Departure) {
        this.lng1Departure = lng1Departure;
    }

    public Double getLat1Arrival() {
        return lat1Arrival;
    }

    public void setLat1Arrival(Double lat1Arrival) {
        this.lat1Arrival = lat1Arrival;
    }

    public Double getLng1Arrival() {
        return lng1Arrival;
    }

    public void setLng1Arrival(Double lng1Arrival) {
        this.lng1Arrival = lng1Arrival;
    }

    public Double getLat2Departure() {
        return lat2Departure;
    }

    public void setLat2Departure(Double lat2Departure) {
        this.lat2Departure = lat2Departure;
    }

    public Double getLng2Departure() {
        return lng2Departure;
    }

    public void setLng2Departure(Double lng2Departure) {
        this.lng2Departure = lng2Departure;
    }

    public Double getLat2Arrival() {
        return lat2Arrival;
    }

    public void setLat2Arrival(Double lat2Arrival) {
        this.lat2Arrival = lat2Arrival;
    }

    public Double getLng2Arrival() {
        return lng2Arrival;
    }

    public void setLng2Arrival(Double lng2Arrival) {
        this.lng2Arrival = lng2Arrival;
    }

    public Double getLat3Departure() {
        return lat3Departure;
    }

    public void setLat3Departure(Double lat3Departure) {
        this.lat3Departure = lat3Departure;
    }

    public Double getLng3Departure() {
        return lng3Departure;
    }

    public void setLng3Departure(Double lng3Departure) {
        this.lng3Departure = lng3Departure;
    }

    public Double getLat3Arrival() {
        return lat3Arrival;
    }

    public void setLat3Arrival(Double lat3Arrival) {
        this.lat3Arrival = lat3Arrival;
    }

    public Double getLng3Arrival() {
        return lng3Arrival;
    }

    public void setLng3Arrival(Double lng3Arrival) {
        this.lng3Arrival = lng3Arrival;
    }

    public Double getLat4Departure() {
        return lat4Departure;
    }

    public void setLat4Departure(Double lat4Departure) {
        this.lat4Departure = lat4Departure;
    }

    public Double getLng4Departure() {
        return lng4Departure;
    }

    public void setLng4Departure(Double lng4Departure) {
        this.lng4Departure = lng4Departure;
    }

    public Double getLat4Arrival() {
        return lat4Arrival;
    }

    public void setLat4Arrival(Double lat4Arrival) {
        this.lat4Arrival = lat4Arrival;
    }

    public Double getLng4Arrival() {
        return lng4Arrival;
    }

    public void setLng4Arrival(Double lng4Arrival) {
        this.lng4Arrival = lng4Arrival;
    }

    public Double getLat5Departure() {
        return lat5Departure;
    }

    public void setLat5Departure(Double lat5Departure) {
        this.lat5Departure = lat5Departure;
    }

    public Double getLng5Departure() {
        return lng5Departure;
    }

    public void setLng5Departure(Double lng5Departure) {
        this.lng5Departure = lng5Departure;
    }

    public Double getLat5Arrival() {
        return lat5Arrival;
    }

    public void setLat5Arrival(Double lat5Arrival) {
        this.lat5Arrival = lat5Arrival;
    }

    public Double getLng5Arrival() {
        return lng5Arrival;
    }

    public void setLng5Arrival(Double lng5Arrival) {
        this.lng5Arrival = lng5Arrival;
    }

    public Double getLat6Departure() {
        return lat6Departure;
    }

    public void setLat6Departure(Double lat6Departure) {
        this.lat6Departure = lat6Departure;
    }

    public Double getLng6Departure() {
        return lng6Departure;
    }

    public void setLng6Departure(Double lng6Departure) {
        this.lng6Departure = lng6Departure;
    }

    public Double getLat6Arrival() {
        return lat6Arrival;
    }

    public void setLat6Arrival(Double lat6Arrival) {
        this.lat6Arrival = lat6Arrival;
    }

    public Double getLng6Arrival() {
        return lng6Arrival;
    }

    public void setLng6Arrival(Double lng6Arrival) {
        this.lng6Arrival = lng6Arrival;
    }

    public Double getLat7Departure() {
        return lat7Departure;
    }

    public void setLat7Departure(Double lat7Departure) {
        this.lat7Departure = lat7Departure;
    }

    public Double getLng7Departure() {
        return lng7Departure;
    }

    public void setLng7Departure(Double lng7Departure) {
        this.lng7Departure = lng7Departure;
    }

    public Double getLat7Arrival() {
        return lat7Arrival;
    }

    public void setLat7Arrival(Double lat7Arrival) {
        this.lat7Arrival = lat7Arrival;
    }

    public Double getLng7Arrival() {
        return lng7Arrival;
    }

    public void setLng7Arrival(Double lng7Arrival) {
        this.lng7Arrival = lng7Arrival;
    }
    public String getBagPnrCode() {
        return bagPnrCode;
    }

    public void setBagPnrCode(String bagPnrCode) {
        this.bagPnrCode = bagPnrCode;
    }
}

