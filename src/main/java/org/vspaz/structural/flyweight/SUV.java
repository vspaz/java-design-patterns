package org.vspaz.structural.flyweight;

public class SUV implements IVehicle {
    private final String carType;

    public SUV() {
        carType = String.format("'%s' created", SUV.class.getName());
    }

    public String getInfo(String color) {
        return String.format("car '%s' of color '%s' is created", carType, color);
    }
}
