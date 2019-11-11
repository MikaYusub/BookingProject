package Service;

import DAO.Identifiable;
import Flights.Flights;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Identifiable<Integer> {
    private Flights flight;
    private LocalDate date;
    private String name;
    private String surname;
    private int ID;

    public Booking(Flights flight, String name, String surname) {
        this.flight = flight;
        this.name = name;
        this.surname = surname;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "flight=" + flight +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return ID == booking.ID &&
                Objects.equals(flight, booking.flight) &&
                Objects.equals(date, booking.date) &&
                Objects.equals(name, booking.name) &&
                Objects.equals(surname, booking.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight, date, name, surname, ID);
    }

    public Integer id() {
        return id();
    }
}
