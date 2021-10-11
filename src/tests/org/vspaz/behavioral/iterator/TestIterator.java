package org.vspaz.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestIterator {
  @Test
  void testIteratorOk() {
    Garage garage = new Garage();
    String[] parkedCars = new String[] {"audi", "bmw", "mercedes", "tesla"};
    Iterator cars = garage.createIterator(parkedCars);
    assertEquals("audi", cars.getCurrent());
    assertEquals("bmw", cars.next());
    assertTrue(cars.hasNext());
    cars.next();  // -> mercedes
    cars.next();  // -> tesla
    assertEquals("tesla", cars.getCurrent());
    assertFalse(cars.hasNext());
  }
}
