package org.vspaz.behavioral.iterator;

public class CarIterator implements Iterator {
  private final String[] cars;
  private int position;

  public CarIterator(String[] cars) {
    this.cars = cars;
    this.position = 0;
  }

  @Override
  public void first() {
    this.position = 0;
  }

  @Override
  public String next() {
    return this.cars[++position];
  }

  @Override
  public String getCurrent() {
    return cars[position];
  }

  @Override
  public boolean hasNext() {
    return position <= cars.length;
  }
}
