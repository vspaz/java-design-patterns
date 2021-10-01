package org.vspaz.creational.factory;

public class Wolf implements IAnimal {
  @Override
  public String makeSound() {
    return "growl";
  }

  @Override
  public String getFood() {
    return "attack prey";
  }
}
