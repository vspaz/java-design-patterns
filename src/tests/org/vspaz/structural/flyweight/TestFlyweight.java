package org.vspaz.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlyweight {
  @Test
  void testFlyweightOk() throws Exception {
    IVehicle suv_1 = CarFactory.getCar("suv");
    assertEquals(
        suv_1.getInfo("blue"),
        "car 'org.vspaz.structural.flyweight.SUV' of color 'blue' is created");

    IVehicle suv_2 = CarFactory.getCar("suv");
    assertEquals(suv_1, suv_2);
  }
}
