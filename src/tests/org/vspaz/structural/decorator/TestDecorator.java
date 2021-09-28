package org.vspaz.structural.decorator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDecorator {
    @Test
    void testDecoratorOk() {
        Block block = new Block();
        Assert.assertEquals(block.buildHouse(), "house is built");
    }
}
