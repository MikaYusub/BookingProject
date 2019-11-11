package Controller;

import Flights.Flights;
import Service.Service;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.println("___MENU___");
        System.out.println("1.---Online Board---");
        System.out.println("2.---Show the Flight info---");
        System.out.println("3.---Search and Book a Flight---");
        System.out.println("4.---Cancel the Booking---");
        System.out.println("5.---My Flights---");
        System.out.println("6.---Exit---");

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        int item;
        System.out.println("Please select a menu item by typing corresponding number from 1-6:\n");
        item = scanner.nextInt();
        service.service(item); //Calling service

    }

}
