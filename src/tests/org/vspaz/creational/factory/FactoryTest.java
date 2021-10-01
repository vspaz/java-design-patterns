package org.vspaz.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
  @Test
  void testCowOk() {
    IAnimal cow = AnimalFactory.getAnimal("cow");
    assertNotNull(cow);
    assertEquals(cow.getFood(), "grazing");
    assertEquals(cow.makeSound(), "mu...");
  }

  @Test
  void testAnimalUndefined() {
    IAnimal someUndefAnimal = AnimalFactory.getAnimal("undef");
    assertNull(someUndefAnimal);
  }

  @Test
  void testWulfOk() {
    Wolf wolf = (Wolf) AnimalFactory.getAnimal("wolf");
    assertNotNull(wolf);
    assertEquals(wolf.getFood(), "attack prey");
    assertEquals(wolf.makeSound(), "growl");
  }
}
