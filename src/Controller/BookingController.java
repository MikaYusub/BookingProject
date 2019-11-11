package Controller;

import Flights.Flights;
import Service.Booking;
import Service.BookingsServices;

import java.util.List;

public class BookingController {
    private BookingsServices bookingsService;

    public BookingController(BookingsServices bookingsService) {
        this.bookingsService = bookingsService;
    }

    public Booking createBooking(Flights flight, String name, String surname){
        return bookingsService.createBooking(flight, name, surname);
    }

    public void deleteBookingByID(int ID) {
        bookingsService.deleteBookingByID(ID);
    }

    public List<Booking> showSelectedBookings(String name, String surname) {
        return bookingsService.showSelectedBookings(name, surname);
    }
}
