package org.vspaz.creational.afactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAbstractFactory {
  @Test
  void testDomesticFactoryOk() {
    IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
    IAnimalae russianBlue = domesticFactory.getAnimal("russian-blue");

    assertEquals(russianBlue.makeSound(), "meow, meow");
    assertEquals(russianBlue.doAction(), "sleep on the coach");
  }

  @Test
  void testUndefDomesticAnimal() {
    IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
    assertThrows(
        RuntimeException.class,
        () -> {
          domesticFactory.getAnimal("someUndefAnimal");
        });
  }

  @Test
  void testCreateFactoryFail() {
    assertThrows(
        RuntimeException.class,
        () -> {
          AnimalAbstractFactory.getAnimalFactory("someUndefFactory");
        });
  }

  @Test
  void testWildFactoryOk() {
    IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
    IAnimalae lynx = wildAnimalFactory.getAnimal("lynx");

    assertEquals(lynx.makeSound(), "growl");
    assertEquals(lynx.doAction(), "kill a wild goat");
  }

  @Test
  void testUndefWildAnimal() {
    IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
    assertThrows(
        RuntimeException.class,
        () -> {
          wildAnimalFactory.getAnimal("someUndefWildAnimal");
        });
  }
}
