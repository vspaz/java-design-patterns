package org.vspaz.creational.afactory;

public class Dachshund implements ICanine {
  @Override
  public String makeSound() {
    return "woof, woof";
  }

  @Override
  public String doAction() {
    return "run around the house";
  }
}
