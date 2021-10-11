package org.vspaz.behavioral.iterator;

public class Garage implements IVehicle {
  @Override
  public Iterator createIterator(String[] collection) {
    return new CarIterator(collection);
  }
}
