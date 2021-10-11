package org.vspaz.behavioral.iterator;

public class CarIterator implements Iterator {
  private final String[] cars;
  private final int position;

  public CarIterator(String[] cars) {
    this.cars = cars;
    this.position = 0;
  }

  @Override
  public void first() {}

  @Override
  public String next() {
    return null;
  }

  @Override
  public String getCurrent() {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }
}
