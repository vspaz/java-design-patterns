package org.vspaz.structural.flyweight;

public class Truck implements IVehicle {
  private final String carType;

  public Truck() {
    carType = String.format("car '%s'", Truck.class.getName());
  }

  public String getInfo(String color) {
    return String.format("'%s' of color '%s' is created", carType, color);
  }
}
