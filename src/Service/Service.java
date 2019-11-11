package Service;

import Flights.Flights;

import java.util.Scanner;

public class Service {

    public void service(int item){

        Flights flights = new Flights(1, 100, 56,"11/02/2019","11:00","Kiev", "Baku");
        Flights flights1 = new Flights(2, 100, 56,"11/02/2019","11:00","Kiev", "Istanbul");
        Scanner scanner = new Scanner(System.in);
        boolean q = false;
        do {
            System.out.println("Please select a menu item by typing corresponding number from 1-6:\n");
            item = scanner.nextInt();
            switch (item) {
                case 1:
                    //Online-board
                    System.out.println("\n---Online Board---");
                    System.out.println(flights.toString());
                    break;
                case 2:
                    //flight
                    System.out.println("\n---Flight info---");
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
