package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {

        //test runs
        Moped m1 = new Moped("Blue", "50 cc", "Step Through", 2, 200, 2, 2, 10, 3000.00, true, true, true, true);
        System.out.println(m1.getColor());
        System.out.println(m1.getBodyFrame());
        Moped m2 = new Moped("Blue", "50 cc", "Step Through", 2, 200, 2, 2, 10, 3000.00, true, true, true, true);


        //Car ferrari = new Car();
        //ferrari.setColor("Red");
       // ferrari.setEngineType("V12");
        //System.out.println(ferrari.getEngineType());

        //SemiTruck bumblebee = new SemiTruck();
        //bumblebee.setColor("Yellow");
        //bumblebee.setCargoCapacity(40);
        //System.out.println(bumblebee.getCargoCapacity());

        //Hovercraft h1 = new Hovercraft();
        //h1.setHasWheels(false);
        //h1.setGasOnly(true);


   }
}
