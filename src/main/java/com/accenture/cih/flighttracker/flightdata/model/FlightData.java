package com.accenture.cih.flighttracker.flightdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="flightdata")
@Data
public class FlightData {

    @Column(name="SOURCE_AIRPORT")
    private String sourceAirport;

    @Column(name="DESTINATION_AIRPORT")
    private String destinationAirport;

    @Column(name="DEPARTURE_TIME")
    private Long departureTime;

    @Column(name="ARRIVAL_TIME")
    private Long arrivalTime;

    @Column(name="JOURNEY_TIME")
    private Long journeyTime;

    @Column(name="DISTANCE")
    private Long distance;

    @Column(name="LAST_UPDATED_TIMESTAMP")
    private Long lastUpdatedTimestamp;

    @Id
    @Column(name="CALL_SIGN")
    private String callSign;

    @Column(name="DEPARTURE_TIME_ZONE")
    private String departureTimeZone;

    @Column(name="ARRIVAL_TIMEZONE")
    private String arrivalTimeZone;

    @Column(name="SOURCE_AIRPORT_LATITUDE")
    private Double sourceAirportLatitude;

    @Column(name="SOURCE_AIRPORT_LONGITUDE")
    private Double sourceAirportLongitude;

    @Column(name="DESTINATION_AIRPORT_LATITUDE")
    private Double destinationAirportLatitude;

    @Column(name="DESTINATION_AIRPORT_LONGITUDE")
    private Double destinationAirportLongitude;



    /**
    public FlightData() {

    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public BigInteger getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(BigInteger journeyTime) {
        this.journeyTime = journeyTime;
    }

    public BigInteger getDistance() {
        return distance;
    }

    public void setDistance(BigInteger distance) {
        this.distance = distance;
    }

    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }
     **/
}
