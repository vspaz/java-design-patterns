package org.vspaz.structural.adapter;

public class CalculatorAdapter {
    public double getArea(Triangle triangle) {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle(0.5 * triangle.height, triangle.base);
        return calculator.getArea(rectangle);
    }
}
