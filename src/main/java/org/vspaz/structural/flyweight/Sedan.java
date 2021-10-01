package org.vspaz.structural.flyweight;

public class Sedan implements IVehicle{
    private final String carType;

    public Sedan() {
        carType = String.format("car '%s'", Sedan.class.getName());
    }
    public String getInfo(String color) {
        return String.format("%s of color '%s' is created", carType, color);
    }
}
