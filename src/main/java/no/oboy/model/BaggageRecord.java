package no.oboy.model;

import com.opencsv.bean.*;
import java.time.LocalDateTime;

public class BaggageRecord {

    @CsvBindByPosition(position = 0)
    String sourceOrganization;
    @CsvBindByPosition(position = 1)
    String sourceSystem;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 2)
    LocalDateTime sourceTimestamp;
    @CsvBindByPosition(position = 3, required = true)
    String bagTagNumber;
    @CsvBindByPosition(position = 4)
    BagEventCode bagEventCode;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 5)
    LocalDateTime bagEventTimestamp;
    @CsvBindByPosition(position = 6, required = true)
    String bagEventAirportIATA;
    @CsvBindByPosition(position = 7)
    String bagEventLocation;
    @CsvCustomBindByPosition(converter = BagEventDescriptionConverter.class, position = 8)
    BagEventDescription bagEventDescription;
    @CsvBindByPosition(position = 9)
    String bagEventErrorCode;
    @CsvBindByPosition(position = 10)
    String bagFinalAirportIATA;
    @CsvBindByPosition(position = 11)
    int legArrayLength;
    @CsvBindByPosition(position = 12)
    String leg0DepartureAirportIATA;
    @CsvBindByPosition(position = 13)
    String leg0ArrivalAirportIATA;
    @CsvBindByPosition(position = 14)
    String leg0OperatingAirlineIATA;
    @CsvBindByPosition(position = 15)
    String leg0FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 16)
    LocalDateTime leg0Sobt;
    @CsvBindByPosition(position = 17)
    String leg1DepartureAirportIATA;
    @CsvBindByPosition(position = 18)
    String leg1ArrivalAirportIATA;
    @CsvBindByPosition(position = 19)
    String leg1OperatingAirlineIATA;
    @CsvBindByPosition(position = 20)
    String leg1FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 21)
    LocalDateTime leg1Sobt;
    @CsvBindByPosition(position = 22)
    String leg2DepartureAirportIATA;
    @CsvBindByPosition(position = 23)
    String leg2ArrivalAirportIATA;
    @CsvBindByPosition(position = 24)
    String leg2OperatingAirlineIATA;
    @CsvBindByPosition(position = 25)
    String leg2FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 26)
    LocalDateTime leg2Sobt;
    @CsvBindByPosition(position = 27)
    String leg3DepartureAirportIATA;
    @CsvBindByPosition(position = 28)
    String leg3ArrivalAirportIATA;
    @CsvBindByPosition(position = 29)
    String leg3OperatingAirlineIATA;
    @CsvBindByPosition(position = 30)
    String leg3FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 31)
    LocalDateTime leg3Sobt;
    @CsvBindByPosition(position = 32)
    String leg4DepartureAirportIATA;
    @CsvBindByPosition(position = 33)
    String leg4ArrivalAirportIATA;
    @CsvBindByPosition(position = 34)
    String leg4OperatingAirlineIATA;
    @CsvBindByPosition(position = 35)
    String leg4FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 36)
    LocalDateTime leg4Sobt;
    @CsvBindByPosition(position = 37)
    String leg5DepartureAirportIATA;
    @CsvBindByPosition(position = 38)
    String leg5ArrivalAirportIATA;
    @CsvBindByPosition(position = 39)
    String leg5OperatingAirlineIATA;
    @CsvBindByPosition(position = 40)
    String leg5FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 41)
    LocalDateTime leg5Sobt;
    @CsvBindByPosition(position = 42)
    String leg6DepartureAirportIATA;
    @CsvBindByPosition(position = 43)
    String leg6ArrivalAirportIATA;
    @CsvBindByPosition(position = 44)
    String leg6OperatingAirlineIATA;
    @CsvBindByPosition(position = 45)
    String leg6FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 46)
    LocalDateTime leg6Sobt;
    @CsvBindByPosition(position = 47)
    String leg7DepartureAirportIATA;
    @CsvBindByPosition(position = 48)
    String leg7ArrivalAirportIATA;
    @CsvBindByPosition(position = 49)
    String leg7OperatingAirlineIATA;
    @CsvBindByPosition(position = 50)
    String leg7FlightId;
    @CsvCustomBindByPosition(converter = LocalDateTimeConverter.class, position = 51)
    LocalDateTime leg7Sobt;
    @CsvBindByPosition(position = 52)
    String bagPnrCode;

    public BaggageRecord() {
    }

    public String getSourceOrganization() {
        return sourceOrganization;
    }

    public void setSourceOrganization(String sourceOrganization) {
        this.sourceOrganization = sourceOrganization;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
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

    public String getBagEventLocation() {
        return bagEventLocation;
    }

    public void setBagEventLocation(String bagEventLocation) {
        this.bagEventLocation = bagEventLocation;
    }

    public BagEventDescription getBagEventDescription() {
        return bagEventDescription;
    }

    public void setBagEventDescription(BagEventDescription bagEventDescription) {
        this.bagEventDescription = bagEventDescription;
    }

    public String getBagEventErrorCode() {
        return bagEventErrorCode;
    }

    public void setBagEventErrorCode(String bagEventErrorCode) {
        this.bagEventErrorCode = bagEventErrorCode;
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

    public String getLeg0OperatingAirlineIATA() {
        return leg0OperatingAirlineIATA;
    }

    public void setLeg0OperatingAirlineIATA(String leg0OperatingAirlineIATA) {
        this.leg0OperatingAirlineIATA = leg0OperatingAirlineIATA;
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

    public String getLeg1OperatingAirlineIATA() {
        return leg1OperatingAirlineIATA;
    }

    public void setLeg1OperatingAirlineIATA(String leg1OperatingAirlineIATA) {
        this.leg1OperatingAirlineIATA = leg1OperatingAirlineIATA;
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

    public String getLeg2OperatingAirlineIATA() {
        return leg2OperatingAirlineIATA;
    }

    public void setLeg2OperatingAirlineIATA(String leg2OperatingAirlineIATA) {
        this.leg2OperatingAirlineIATA = leg2OperatingAirlineIATA;
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

    public String getLeg3OperatingAirlineIATA() {
        return leg3OperatingAirlineIATA;
    }

    public void setLeg3OperatingAirlineIATA(String leg3OperatingAirlineIATA) {
        this.leg3OperatingAirlineIATA = leg3OperatingAirlineIATA;
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

    public String getLeg4OperatingAirlineIATA() {
        return leg4OperatingAirlineIATA;
    }

    public void setLeg4OperatingAirlineIATA(String leg4OperatingAirlineIATA) {
        this.leg4OperatingAirlineIATA = leg4OperatingAirlineIATA;
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

    public String getLeg5OperatingAirlineIATA() {
        return leg5OperatingAirlineIATA;
    }

    public void setLeg5OperatingAirlineIATA(String leg5OperatingAirlineIATA) {
        this.leg5OperatingAirlineIATA = leg5OperatingAirlineIATA;
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

    public String getLeg6OperatingAirlineIATA() {
        return leg6OperatingAirlineIATA;
    }

    public void setLeg6OperatingAirlineIATA(String leg6OperatingAirlineIATA) {
        this.leg6OperatingAirlineIATA = leg6OperatingAirlineIATA;
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

    public String getLeg7OperatingAirlineIATA() {
        return leg7OperatingAirlineIATA;
    }

    public void setLeg7OperatingAirlineIATA(String leg7OperatingAirlineIATA) {
        this.leg7OperatingAirlineIATA = leg7OperatingAirlineIATA;
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

    public String getBagPnrCode() {
        return bagPnrCode;
    }

    public void setBagPnrCode(String bagPnrCode) {
        this.bagPnrCode = bagPnrCode;
    }
}

