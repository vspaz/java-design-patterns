package org.vspaz.creational.afactory;

public class DomesticAnimalFactory implements IAnimalFactory {
  public IAnimalae getAnimal(String species) {
    switch (species) {
      case "russian-blue":
        return new RussianBlue();
      case "dachshund":
        return new Dachshund();
      default:
        throw new RuntimeException(String.format("'%s' undefined", species));
    }
  }
}
