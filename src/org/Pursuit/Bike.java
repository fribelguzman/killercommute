package org.Pursuit;

public class Bike implements Transportationtype {

    public static String name = "Bike";

    @Override
    public Transportationtype[] alternateMethods() {
        return new Transportationtype[0];
    }

    @Override
    public void badService(String destination) {

    }

    @Override
    public String name() {
        return name;
    }
//method bike ride is taking in string destination and printing they arrived
    void bikeRide(String destination) {
        System.out.println("WoooHooo!You have arrived at "+ destination + " congratulations, enjoy!! =) ");
    }
}
