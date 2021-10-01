package org.vspaz.structural.adapter;

import org.testng.Assert;
import org.junit.Test;

public class TestAdapter {
    @Test
    public void testAdapterOk() {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle(20, 30);
        Assert.assertEquals(calculator.getArea(rectangle), 600);

        Triangle triangle = new Triangle(10, 20);
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Assert.assertEquals(calculatorAdapter.getArea(triangle), 100);
    }
}
