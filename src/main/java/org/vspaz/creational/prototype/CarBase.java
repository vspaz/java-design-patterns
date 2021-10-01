package org.vspaz.creational.prototype;

import java.util.Random;

public abstract class CarBase implements Cloneable {

  public String modelName;
  public int basePrice;
  public int onRoadPrice;

  public static int setExtraPrice() {
    return new Random().nextInt(10_000);
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public CarBase clone() throws CloneNotSupportedException {
    return (CarBase) super.clone();
  }
}
