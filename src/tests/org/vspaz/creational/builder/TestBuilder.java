package org.vspaz.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuilder {
  @Test
  void testBuilderOk() {
    Car car = new Car("Corvette");
    car.Body("carbon");
    car.Wheels(4);
    car.Headlights("neon");

    String corvette = car.Build();
    assertEquals(
        corvette,
        "Car model is 'Corvette', chassis 'carbon', 'has '4' wheels, headlights type is 'neon'.");
  }
}
