package org.vspaz.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVisitor {
  @Test
  void testVisitorOk() {
    Visitor visitor = new Visitor();

    City city = new City();
    assertEquals("NYC visited.", city.acceptVisitor(visitor));

    Village village = new Village();
    assertEquals("in the middle of nowhere visited.", village.acceptVisitor(visitor));
  }
}
