package DAO;

import Additional.Paths;
import Additional.WriterReader;
import Flights.Flights;
import Service.Booking;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class BookingsDAO implements DAO<Integer, Booking> {
    private Map<Flights, List<Booking>> bookings;
    private final WriterReader<Map<Flights, List<Booking>>> writerReader = new WriterReader<>();


    public BookingsDAO() {
        if (isCollectionExist(Paths.bookingsPath)) {

            try {
                bookings = writerReader.Reader(Paths.bookingsPath, bookings);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("The source file will be renewed!");
                this.bookings = new HashMap<>();
                writerReader.Writer(Paths.bookingsPath, this.bookings);
            }

        } else {
            this.bookings = new HashMap<>();
            writerReader.Reader(Paths.bookingsPath, this.bookings);
        }
    }

    private boolean isCollectionExist(String path) {
        return new File(path).isFile();
    }

    @Override
    public void save(Booking booking) {
        if (bookings.get(booking.getFlight()) == null) {
            bookings.put(booking.getFlight(), new ArrayList<>(Arrays.asList(booking)));
        } else if (bookings.get(booking.getFlight()).indexOf(booking) < 0) {
            List<Booking> newList = bookings.get(booking.getFlight());
            newList.add(booking);
            bookings.replace(booking.getFlight(), newList);
        } else {
            List<Booking> newList = bookings.get(booking.getFlight());
            newList.set(newList.indexOf(booking), booking);
            bookings.replace(booking.getFlight(), newList);
        }
        writerReader.Writer(Paths.bookingsPath, bookings);
    }

    @Override
    public Booking getById(Integer ID) {
        for (Booking booking : getAll()) {
            if (booking.id().equals(ID)) {
                return booking;
            }
        }
        return null;
    }

    @Override
    public Collection<Booking> getAll() {
        return bookings.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(Integer ID) {
        if (ID == null) {
            return;
        }
        final boolean[] check = {false};
        bookings.forEach((flight, list) -> {
            final int[] bookingIndexInList = {0};
            list.forEach(booking -> {
                if (booking.id().equals(ID)) {
                    check[0] = true;
                    bookingIndexInList[0] = list.indexOf(booking);
                }
            });
            if (check[0]) {
                list.remove(bookingIndexInList[0]);
            }
        });
        if (check[0]) {
            writerReader.Writer(Paths.bookingsPath, bookings);
        }
    }

    public Map<Flights, List<Booking>> getBookings() {
        return bookings;
    }
}
