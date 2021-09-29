package org.vspaz.structural.adapter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdapter {
    @Test
    void testAdapterOk() {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle(20, 30);
        Assert.assertEquals(calculator.getArea(rectangle), 600);
    }
}
