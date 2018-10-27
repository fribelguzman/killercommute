package org.Pursuit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//initializing global instances of each to use everywhere
    public static Scanner scanner = new Scanner(System.in);
    static Walk walk = new Walk();
    static Uber uber = new Uber();
    static Bus bus = new Bus();
    static Bike bike = new Bike();
    static Train train;
    public static String destination;
    static Transportationtype choice;
    static List<String> pastChoice = new ArrayList<>();
    static Boolean keepTrying = true;

    //methods begin
    public static void main(String[] args) {
        intro();
    }

    static void intro() {
        //intro
        System.out.println("Wassup! Welcome to New york City Baby the city that never sleeps! " +
                "\n We have an amazing 24 hour public transportation system. " +
                "\n Im here to guide you to your destination, All you gotta do is tell me where you wanna go and ill show you how to get there. " +
                "\n So where would you like to go?");
        //choose destination
        destination = scanner.next();
        //which train we taking
        System.out.println("Great the easiest way to get to " + destination + " is by train. We have an amazing subway system." +
                "\n So which train would you like to take?");
        //answer
        askForTrain();

    }
//method as for train
    static void askForTrain() {
        train = new Train();
        choice = train;
        String answer = scanner.next();
        train.trainDelay(answer, destination);
        giveOptions(train);

    }
//do dey want to keep going yes or nah
    static void keepGoing() {
        System.out.println("Would You like to keep going to " + destination + " ? Yes or No?");
        while (keepTrying) {
            String answer = scanner.next();
            yesNoToBool(answer);
        }
    }

        //if yes give options if not bye , if else yes or no fool

        static void yesNoToBool(String answer) {
            answer = answer.toLowerCase();
            if (answer.equals("yes")) {
                keepTrying = true;
                giveOptions(choice);

            } else if (answer.equals("no")) {
                keepTrying = false;
                System.out.println("Sorry you did not make it to your destination , Goodbye");

            } else {
                System.out.println("YES OR NO FOOL!");
                keepGoing();

            }
        }


    // giving them options without repeating past options
    static void giveOptions(Transportationtype type) {
        System.out.println(" Which transportation method would you like to try ?");
        Transportationtype[] options = type.alternateMethods();
        for (Transportationtype t : options) {
            if (!pastChoice.contains(t.name())) {
                System.out.println(t.name());
            }
        }
        giveBadService();
        if (keepTrying == true) {
            keepGoing();
        }


    }
    //switch selections of types

    static void giveBadService() {
        String selection = scanner.next().toUpperCase();
        switch (selection) {
            case "WALK":
                walk.badService(destination);
                choice = walk;
                pastChoice.add(walk.name());
                break;
            case "BUS":
                bus.badService(destination);
                choice = bus;
                pastChoice.add(bus.name());
                break;
            case "UBER":
                uber.badService(destination);
                choice = uber;
                pastChoice.add(uber.name());
                break;
            case "BIKE":
                bike.bikeRide(destination);
                keepTrying = false;
               /* choice = bike;
                pastChoice.add(bike.name());*/
                break;
        }

    }

}

