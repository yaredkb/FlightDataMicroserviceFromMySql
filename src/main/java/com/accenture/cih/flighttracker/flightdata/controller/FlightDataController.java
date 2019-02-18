package com.accenture.cih.flighttracker.flightdata.controller;

import com.accenture.cih.flighttracker.flightdata.service.FlightDataService;
import com.accenture.cih.flighttracker.flightdata.model.FlightData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.List;

@RestController
@CrossOrigin
public class FlightDataController {

    @Autowired
    FlightDataService flightDataService;

    @GetMapping("/flights")
    public List<FlightData> getAllFlights() {
        return flightDataService.getAllFlights();
    }

    @GetMapping("/flights/{id}")
    public FlightData getOneFlight(@PathVariable String id) {
        return flightDataService.getSingleFlight(id);
    }

    @GetMapping("/flights/now")
    public List<FlightData> getCurrentFlights() {
        return flightDataService.getCurrentFlights();
    }

    @PostMapping("/flights")
    public void addFlight(@RequestBody FlightData flight) {
        flightDataService.addFlight(flight);
    }

    @PutMapping("/flights")
    public void updateFlight(@RequestBody FlightData flight) {
        flightDataService.updateFlight(flight);
    }

//    @GetMapping("/flights/fix")
//    public List<FlightData> fixFlights() {
//        List<FlightData> flights = flightDataService.getAllFlights();
//
//        for(FlightData flight: flights){
//
//            LocalDateTime flightDeparture = LocalDateTime.ofEpochSecond(flight.getDepartureTime(), 0,  ZoneOffset.of(ZoneOffset.SHORT_IDS.get("EST")));
//            long secondsDeparture = (flightDeparture.getHour() * 60 * 60) + (flightDeparture.getMinute() * 60) + flightDeparture.getSecond();
//            flight.setDepartureTime(secondsDeparture);
//
//            LocalDateTime flightArrival = LocalDateTime.ofEpochSecond(flight.getArrivalTime(), 0,  ZoneOffset.of(ZoneOffset.SHORT_IDS.get("EST")));
//            long secondsArrival = (flightArrival.getHour() * 60 * 60) + (flightArrival.getMinute() * 60) + flightArrival.getSecond();
//            flight.setArrivalTime(secondsArrival);
//
//            flight.setJourneyTime((secondsArrival - secondsDeparture));
//
//            flightDataService.updateFlight(flight);
//
//        }
//
//        return getAllFlights();
//
//
//
//        //LocalDate date =
//
//    }

//    @GetMapping("/flights/check/{ts}")
//    public String checkFlights(@PathVariable String ts){
//
//        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.of(2019, 1, 23, 0, 0, 0).plusSeconds(Long.parseLong(ts)), ZoneOffset.of(ZoneOffset.SHORT_IDS.get("EST")));
//        return zdt.toInstant().toString();
//        //.toInstant(ZoneOffset)
////                    LocalDateTime.ofEpochSecond(1547494495, 0, ZoneOffset.of(ZoneOffset.SHORT_IDS.get("EST"))).toString()
////                    +
////                            "<br>\n"+
////                    LocalDateTime.of(2019, 1, 23, 0, 0, 0).plusSeconds(52495).toString();
//
//    }

}
