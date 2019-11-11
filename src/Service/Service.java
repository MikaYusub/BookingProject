package Service;

import DAO.FlightDB;
import Flights.Flights;

import java.util.Scanner;

public class Service {

    public void service(int item){
        FlightDB flightDB = new FlightDB();
        Scanner scanner = new Scanner(System.in);
        boolean q = false;
        int id;
        do {
            System.out.println("Please select a menu item by typing corresponding number from 1-6:\n");
            item = scanner.nextInt();
            switch (item) {
                case 1:
                    //Online-board
                    System.out.println("\n---Online Board---");
                    System.out.println(flightDB.toString());
                    break;
                case 2:
                    //flight
                    System.out.println("\n---Flight info---");
                    System.out.println("Please enter flight id:\n");
                    id = scanner.nextInt();
                    System.out.println(flightDB.byId(id));
                    break;
                case 3:
                    //search and book a flight
                    System.out.println("\n---Search and Book a Flight---");
                    break;
                case 4:
                    //cancel the booking
                    System.out.println("\n---Cancel the Booking---");
                    break;
                case 5:
                    //my flights
                    System.out.println("\n---My Flights---");
                    break;
                case 6:
                    //exit
                    System.out.println("\nAdios.");
                    q = true;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }while (!q);
    }

}
