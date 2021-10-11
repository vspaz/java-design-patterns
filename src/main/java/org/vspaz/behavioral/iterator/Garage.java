package org.vspaz.behavioral.iterator;

public class Garage implements IVehicle {
  private final String[] cars = new String[] {"audi", "bmw", "mercedes", "tesla"};

  @Override
  public Iterator createIterator() {
    return new CarIterator(cars);
  }
}
