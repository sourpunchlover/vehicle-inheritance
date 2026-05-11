package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {

        //test runs
        Moped m1 = new Moped();
        m1.setColor("Blue");
        m1.setNumberOfPassengers(2);
        System.out.println(m1.getColor());

        Car ferrari = new Car();
        ferrari.setColor("Red");
        ferrari.setEngineType("V12");

        SemiTruck bumblebee = new SemiTruck();
        bumblebee.setColor("Yellow");
        bumblebee.setCargoCapacity(40);

        Hovercraft h1 = new Hovercraft();
        h1.setHasWheels(false);
        h1.setGasOnly(true);

   }
}
