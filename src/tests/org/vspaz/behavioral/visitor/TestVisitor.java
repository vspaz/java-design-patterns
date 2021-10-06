package org.vspaz.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVisitor {
  @Test
  void testVisitorOk() {
    Visitor visitor = new Visitor();
    Car car = new Car();
    assertEquals("NYC visited.", car.acceptVisitor(visitor));
  }
}
