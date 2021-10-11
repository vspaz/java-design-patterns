package org.vspaz.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIterator {
  @Test
  void testIteratorOk() {
    Garage garage = new Garage();
    String[] parkedCars = new String[] {"audi", "bmw", "mercedes", "tesla"};
    Iterator cars = garage.createIterator(parkedCars);
    assertEquals("audi", cars.getCurrent());
  }
}
