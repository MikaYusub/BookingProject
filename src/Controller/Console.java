package Controller;

import Flights.Flights;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Flights flights = new Flights(1, 100, 56,"11/02/2019","11:00","Kiev", "Baku");
        Flights flights1 = new Flights(2, 100, 56,"11/02/2019","11:00","Kiev", "Istanbul");
        int item;
        int id;
        boolean q = false;

        System.out.println("___MENU___");
        System.out.println("1.---Online Board---");
        System.out.println("2.---Show the Flight info---");
        System.out.println("3.---Search and Book a Flight---");
        System.out.println("4.---Cancel the Booking---");
        System.out.println("5.---My Flights---");
        System.out.println("6.---Exit---");

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
                    id = scanner.nextInt();
                    if (flights.getId() == id){

                    }
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
