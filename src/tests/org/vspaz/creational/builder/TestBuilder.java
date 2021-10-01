package org.vspaz.creational.builder;

import org.junit.Test;
import org.testng.Assert;

public class TestBuilder {
  @Test
  public void testBuilderOk() {
    Car car = new Car("Corvette");
    car.Body("carbon");
    car.Wheels(4);
    car.Headlights("neon");

    String corvette = car.Build();
    Assert.assertEquals(
        corvette,
        "Car model is 'Corvette', chassis 'carbon', 'has '4' wheels, headlights type is 'neon'.");
  }
}
