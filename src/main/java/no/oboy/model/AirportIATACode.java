package no.oboy.model;

import com.opencsv.bean.CsvBindByPosition;

public class AirportIATACode {

    @CsvBindByPosition(position = 0)
    private String iataCode;
    @CsvBindByPosition(position = 1)
    private double lng;
    @CsvBindByPosition(position = 2)
    private double lat;
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
