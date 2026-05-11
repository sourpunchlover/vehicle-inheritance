package com.pluralsight;

public class Car extends Vehicle{
    public Car(String color, String engineType, String bodyFrame, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfSeats, int wheelType, double price, boolean isGasOnly, boolean hasSteeringControl, boolean hasWheels, boolean hasSeatBelts) {
        super(color, engineType, bodyFrame, numberOfPassengers, cargoCapacity, fuelCapacity, numberOfSeats, wheelType, price, isGasOnly, hasSteeringControl, hasWheels, hasSeatBelts);
    }
}
