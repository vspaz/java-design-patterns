package org.vspaz.structural.flyweight;

public class SUV implements IVehicle {
  private final String carType;

  public SUV() {
    carType = String.format("car '%s'", SUV.class.getName());
  }

  public String getInfo(String color) {
    return String.format("%s of color '%s' is created", carType, color);
  }
}
