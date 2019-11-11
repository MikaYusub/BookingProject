package Controller;

import Service.Service;

import java.util.Scanner;

public class Console {

    public static void menu() {
        System.out.println("\n___MENU___");
        System.out.println("1.---Online Board---");
        System.out.println("2.---Show the Flight info---");
        System.out.println("3.---Search and Book a Flight---");
        System.out.println("4.---Cancel the Booking---");
        System.out.println("5.---My Flights---");
        System.out.println("6.---Exit---\n");
    }


    public static void main(String[] args) {
        menu();
        Service service = new Service();
        service.service(); //Calling service
    }
}
