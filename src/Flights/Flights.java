package Flights;

import java.sql.Time;
import java.util.Date;

public class Flights {
    private int id;
    private int seats_all;
    private int seats_free;
    private String date;
    private String time;
    private String cityFrom;
    private String cityTo;


    public Flights(int id, int seats_all, int seats_free, String date, String time, String cityFrom, String cityTo) {
        this.id = id;
        this.seats_all = seats_all;
        this.seats_free = seats_free;
        this.date = date;
        this.time = time;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public int getId() {
        return id;
    }

    public int getSeats_all() {
        return seats_all;
    }

    public int getSeats_free() {
        return seats_free;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", seats_all=" + seats_all +
                ", seats_free=" + seats_free +
                ", date=" + date +
                ", time=" + time +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                '}';
    }
}
