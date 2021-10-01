package org.vspaz.structural.adapter;

public class CalculatorAdapter {
  public double getArea(Triangle triangle) {
    Calculator calculator = new Calculator();
    Rectangle rectangle = new Rectangle(0.5 * triangle.getHeight(), triangle.getBase());
    return calculator.getArea(rectangle);
  }
}
