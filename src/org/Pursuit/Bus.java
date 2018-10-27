package org.Pursuit;

public class Bus implements Transportationtype {

    public static String name = "Bus";


    @Override
    public Transportationtype[] alternateMethods() {
        Transportationtype[] alternates = {new Walk(),new Uber(), new Bike()};
        return alternates;
    }

    @Override
    public void badService(String destination) {
        System.out.println("Oh No! Once you get on the shuttle bus the driver announces that every road is shut down because the president is in town." +
                "\n That darn President Trump is always causing trouble.");
    }

    @Override
    public String name() {
        return name;
    }
}
