package Flights;

public class Flights {
    private int id;
    private int seats;
    private String cityFrom;
    private String cityTo;

    public Flights(int id, int seats, String cityFrom, String cityTo) {
        this.id = id;
        this.seats = seats;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public int getId() {
        return id;
    }

    public int getSeats() {
        return seats;
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
                ", seats=" + seats +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                '}';
    }
}
