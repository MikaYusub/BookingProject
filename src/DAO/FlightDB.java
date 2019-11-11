package DAO;

import Flights.Flights;

public class FlightDB {
    Flights flights = new Flights(1, 100, 56,"11/02/2019","11:00","Kiev", "Baku");
    Flights flights1 = new Flights(2, 100, 56,"11/02/2019","11:00","Kiev", "Istanbul");

    public String byId(int id){
        if (flights.getId() == id){
            return flights.toString();
        }
        if (flights1.getId() == id){
            return flights1.toString();
        }
        return "Wrong flight id";
    }

    @Override
    public String toString() {
        return flights.toString() + "\n" + flights1.toString();
    }
}
