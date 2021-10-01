package org.vspaz.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdapter {
  @Test
  void testAdapterOk() {
    Calculator calculator = new Calculator();
    Rectangle rectangle = new Rectangle(20, 30);
    assertEquals(calculator.getArea(rectangle), 600);

    Triangle triangle = new Triangle(10, 20);
    CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
    assertEquals(calculatorAdapter.getArea(triangle), 100);
  }
}
