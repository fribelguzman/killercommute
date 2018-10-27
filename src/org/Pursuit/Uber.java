package org.Pursuit;

public  class Uber implements Transportationtype {

    public static String name = "Uber";

    @Override
    public Transportationtype[] alternateMethods() {
        Transportationtype[] alternates = {new Bus(),new Walk(), new Bike()};
        return alternates;
    }

    @Override
    public void badService(String destination) {
        System.out.println("Your Uber says it'll cost $1000.00 to get to " + destination +
                " because there is so much traffic due to President Trump being in town.");
    }

    @Override
    public String name() {
        return name;
    }
}