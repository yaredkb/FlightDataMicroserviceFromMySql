package com.accenture.cih.flighttracker.flightdata.service;

import com.accenture.cih.flighttracker.flightdata.model.FlightData;
import com.accenture.cih.flighttracker.flightdata.repository.FlightDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightDataService {

    @Autowired
    FlightDataRepository flightDataRepository;

    public List<FlightData> getAllFlights() {
        List<FlightData> flights = new ArrayList<>();
        flightDataRepository.findAll().forEach(flights::add);
        return flights;
    }

    public FlightData getSingleFlight(String id) {
        return flightDataRepository.findById(id).get();
    }

    public void addFlight(FlightData flight) {
        flightDataRepository.save(flight);
    }

    public void updateFlight(FlightData flight) {
        flightDataRepository.save(flight);
    }

    public List<FlightData> getCurrentFlights() {
        //long currentTimeSeconds = System.currentTimeMillis() / 1000;
        LocalDateTime nowTime = LocalDateTime.now();
        long currentTimeSeconds = (nowTime.getHour() * 60 * 60) + (nowTime.getMinute() * 60) + nowTime.getSecond();

        return this.getAllFlights()
                .stream()
                .filter(f -> (f.getDepartureTime() < currentTimeSeconds) &&
                        (f.getArrivalTime() > currentTimeSeconds))
                .collect(Collectors.toList());
    }


}
