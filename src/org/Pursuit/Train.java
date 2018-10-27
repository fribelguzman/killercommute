package org.Pursuit;

public class Train implements Transportationtype {

    public static String name = "Train";

    @Override
    public Transportationtype[] alternateMethods() {
        Transportationtype[] alternates = {new Walk(),new Bus(),new Uber(),new Bike()};
        return alternates;
    }

    @Override
    public void badService(String destination) {

    }
//method train delay is passing in the two string paramaters, train answer, and destination answer
    void trainDelay(String train,String destination ){
        System.out.println("So it turns out that there is actually a sick passenger on every " + train.toUpperCase() +
                " train. Dont worry there are plenty ways to get to " + destination + ".");
    }

    @Override
    public String name() {
        return name;
    }


}