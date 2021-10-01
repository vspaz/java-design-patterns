package org.vspaz.creational.afactory;

import org.junit.Test;
import org.testng.Assert;

public class TestAbstractFactory {
  @Test
  public void testDomesticFactoryOk() {
    IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
    IAnimalae russianBlue = domesticFactory.getAnimal("russian-blue");

    Assert.assertEquals(russianBlue.makeSound(), "meow, meow");
    Assert.assertEquals(russianBlue.doAction(), "sleep on the coach");
  }

  @Test
  public void testUndefDomesticAnimal() {
    IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
    Assert.assertThrows(
        RuntimeException.class,
        () -> {
          domesticFactory.getAnimal("someUndefAnimal");
        });
  }

  @Test
  public void testCreateFactoryFail() {
    Assert.assertThrows(
        RuntimeException.class,
        () -> {
          AnimalAbstractFactory.getAnimalFactory("someUndefFactory");
        });
  }

  @Test
  public void testWildFactoryOk() {
    IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
    IAnimalae lynx = wildAnimalFactory.getAnimal("lynx");

    Assert.assertEquals(lynx.makeSound(), "growl");
    Assert.assertEquals(lynx.doAction(), "kill a wild goat");
  }

  @Test
  public void testUndefWildAnimal() {
    IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
    Assert.assertThrows(
        RuntimeException.class,
        () -> {
          wildAnimalFactory.getAnimal("someUndefWildAnimal");
        });
  }
}
