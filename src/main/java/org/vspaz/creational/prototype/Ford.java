package org.vspaz.creational.prototype;

public class Ford extends CarBase {
  public int basePrice = 100_500;

  public Ford(String model) {
    modelName = model;
  }

  @Override
  public CarBase clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
