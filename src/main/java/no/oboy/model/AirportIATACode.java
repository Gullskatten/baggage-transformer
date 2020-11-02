package no.oboy.model;

import com.opencsv.bean.CsvBindByPosition;

public class AirportIATACode {

    @CsvBindByPosition(position = 0)
    private String iataCode;
    @CsvBindByPosition(position = 1)
    private Double lng;
    @CsvBindByPosition(position = 2)
    private Double lat;
    @CsvBindByPosition(position = 3)
    private String type;

    public AirportIATACode() {
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
