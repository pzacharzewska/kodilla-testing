package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsBoard = new HashMap<>();
        flightsBoard.put("Heathrow", true);
        flightsBoard.put("Charles de Gaulle", true);
        flightsBoard.put("JFK", false);

        if (flightsBoard.containsKey(flight.getArrivalAirport()) != false) {
            System.out.println("Airport exists: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport is not found.");
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Heathrow");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found.");
        }
    }
}

