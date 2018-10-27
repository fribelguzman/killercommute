package org.Pursuit;

public class Walk implements Transportationtype {

    public static String name = "Walk ";

    @Override
    public Transportationtype[] alternateMethods() {
        Transportationtype[] alternates = {new Bus(),new Uber(), new Bike()};
        return alternates;

    }

    @Override
    public void  badService(String destination) {
        System.out.println("While you were walking to "+ destination
                + " you run into a ambush of Protestors marching the streets of New york making it impossible to walk to "
                + destination+ ".");
    }
    @Override
    public String name() {
        return name;
    }
}