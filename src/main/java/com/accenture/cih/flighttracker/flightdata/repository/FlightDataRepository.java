package com.accenture.cih.flighttracker.flightdata.repository;

import com.accenture.cih.flighttracker.flightdata.model.FlightData;
import org.springframework.data.repository.CrudRepository;

// callsign is a string
public interface FlightDataRepository extends CrudRepository<FlightData, String> {

}
