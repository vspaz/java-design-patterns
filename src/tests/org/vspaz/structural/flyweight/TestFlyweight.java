package org.vspaz.structural.flyweight;

import org.junit.Test;
import org.testng.Assert;

public class TestFlyweight {
  @Test
  public void testFlyweightOk() throws Exception {
    IVehicle suv_1 = CarFactory.getCar("suv");
    Assert.assertEquals(
        suv_1.getInfo("blue"),
        "car 'org.vspaz.structural.flyweight.SUV' of color 'blue' is created");

    IVehicle suv_2 = CarFactory.getCar("suv");
    Assert.assertEquals(suv_1, suv_2);
  }
}
