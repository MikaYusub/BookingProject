package Controller;

import Flights.Flights;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("___MENU___");

        System.out.println("1.---Online Board---");
        System.out.println("2.---Show the Flight info---");
        System.out.println("3.---Search and Book a Flight---");
        System.out.println("4.---Cancel the Booking---");
        System.out.println("5.---My Flights---");
        System.out.println("6.---Exit---");

        System.out.println("Please select a menu item by typing corresponding number from 1-6:");
        int item = scanner.nextInt();

        switch (item) {
            case 1:
            //Online-board
            System.out.println("---Online Board---");
            Flights flights = new Flights(1, 100, "Kiev", "Baku");
            System.out.println(flights.toString());
            break;
            case 2:
            //flight
            System.out.println("---Flight info---");
            break;
            case 3:
            //search and book a flight
            System.out.println("---Search and Book a Flight---");
            break;
            case 4:
            //cancel the booking
            System.out.println("---Cancel the Booking---");
            break;
            case 5:
            //my flights
            System.out.println("---My Flights---");
            break;
            case 6:
            //exit
            System.out.println("---Exit---");
            break;
            default:
                System.out.println("Wrong input");
        }

    }

}
