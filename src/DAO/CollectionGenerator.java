package DAO;

import Additional.WriterReader;
import Flights.Flights;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionGenerator {
    private final List<String> cities;
    private final WriterReader<Map<String, Flights>> writerReader = new WriterReader<>();


    public CollectionGenerator() {
        try {
            cities = Files.readAllLines(Paths.get(Additional.Paths.cities));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("The cities.txt file can not be read properly. Put the correct cities.txt file to the root directory!");
        }
    }

    public Map<String, Flights> generateNewFlightsCollection(int number, int interval, int capasity) {
        Map<String, Flights> flights = new HashMap<>();

        cities.forEach(city -> {
            LocalDateTime[] ldt = {LocalDate.now().atStartOfDay()};
            for (int i = 0; i < number; i++) {
                int index = (int) (Math.random() * cities.size());
                while (city.equals(cities.get(index))) {
                    index = (int) (Math.random() * cities.size());
                }
//                Flights flight = new Flights(ldt[0], city, cities.get(index), capasity);
//                ldt[0] = ldt[0].plusMinutes(interval);
//                flights.put(flight.id(), flight);
           //TODO ------>>
            }
        });
        writerReader.Writer(Additional.Paths.flightsPath, flights);

        return flights;
    }
}