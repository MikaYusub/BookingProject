package DAO;

import Additional.Paths;
import Additional.WriterReader;
import Flights.Flights;

import java.io.File;
import java.util.Collection;
import java.util.Map;

public class FlightsDAO implements DAO<String, Flights> {
    private Map<String, Flights> flights;
    private final WriterReader<Map<String, Flights>> writerReader = new WriterReader<>();

    public FlightsDAO() {

        if (isCollectionExist(Paths.flightsPath)) {

            try {
                flights = writerReader.Reader(Paths.flightsPath, flights);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("The source file will be renewed!");
                CollectionGenerator collectionGenerator = new CollectionGenerator();
                this.flights = collectionGenerator.generateNewFlightsCollection(500, 15, 150);
            }

        } else {
            CollectionGenerator collectionGenerator = new CollectionGenerator();
            this.flights = collectionGenerator.generateNewFlightsCollection(500, 15, 150);
        }
    }

    private boolean isCollectionExist(String path) {
        return new File(path).isFile();
    }

    @Override
    public Flights getById(String ID) {
        return flights.get(ID);
    }


    public void save(Flights flight) {
        if (flight != null) {
            flights.put(flight.id(), flight);
            writerReader.Writer(Paths.flightsPath, flights);
        }
    }

    @Override
    public Collection<Flights> getAll() {
        return flights.values();
    }

    @Override
    public void remove(String id) {
        if (id == null) {
            return;
        }
        flights.remove(id);
        writerReader.Writer(Paths.flightsPath, flights);
    }

    public Map<String, Flights> getFlights() {
        return flights;
    }

}
