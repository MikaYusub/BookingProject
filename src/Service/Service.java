package Service;

import Controller.Console;
import DAO.FlightDB;
import Flights.Flights;

import java.util.Scanner;

public class Service {

    public void service() {
        FlightDB flightDB = new FlightDB();
        Scanner scanner = new Scanner(System.in);
        boolean q = false;
        int item;
        int id;
        do {
            System.out.println("Please select a menu item by typing corresponding number from 1-6:\n");
            item = scanner.nextInt();
            switch (item) {
                case 1:
                    System.out.println("\n---Online Board---");
                    System.out.println(flightDB.toString());
                    Console.menu();
                    break;
                case 2:
                    System.out.println("\n---Flight info---");
                    System.out.println("Please enter flight id:\n");
                    id = scanner.nextInt();
                    System.out.println(flightDB.byId(id));
                    Console.menu();
                    break;
                case 3:
                    System.out.println("\n---Search and Book a Flight---");
                    Console.menu();
                    break;
                case 4:
                    System.out.println("\n---Cancel the Booking---");
                    Console.menu();
                    break;
                case 5:
                    System.out.println("\n---My Flights---");
                    Console.menu();
                    break;
                case 6:
                    System.out.println("\nAdios.");
                    q = true;
                    break;
                default:
                    System.out.println("Wrong input");
                    Console.menu();
            }
        } while (!q);
    }

}
