package com.pluralsight;

public class Vehicle {
    //class properties
    private String color, engineType, bodyFrame;
    int numberOfPassengers, cargoCapacity, fuelCapacity, numberOfSeats, wheelType;
    double price;
    boolean isGasOnly, hasSteeringControl, hasWheels, hasSeatBelts;

    //getters & setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getBodyFrame() {
        return bodyFrame;
    }

    public void setBodyFrame(String bodyFrame) {
        this.bodyFrame = bodyFrame;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWheelType() {
        return wheelType;
    }

    public void setWheelType(int wheelType) {
        this.wheelType = wheelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGasOnly() {
        return isGasOnly;
    }

    public void setGasOnly(boolean gasOnly) {
        isGasOnly = gasOnly;
    }

    public boolean isHasSteeringControl() {
        return hasSteeringControl;
    }

    public void setHasSteeringControl(boolean hasSteeringControl) {
        this.hasSteeringControl = hasSteeringControl;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isHasSeatBelts() {
        return hasSeatBelts;
    }

    public void setHasSeatBelts(boolean hasSeatBelts) {
        this.hasSeatBelts = hasSeatBelts;
    }
}
