package org.vspaz.creational.prototype;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrototypeTest {
    @Test
    void testPrototypeOK() throws CloneNotSupportedException {
        Tesla tesla_1 = new Tesla("m1");
        CarBase tesla_2 = tesla_1.clone();
        Assert.assertEquals(tesla_1.getModelName(), tesla_2.getModelName());

        tesla_2.setModelName("m2");
        Assert.assertEquals(tesla_2.getModelName(), "m2");
        Assert.assertNotEquals(tesla_1.getModelName(), tesla_2.getModelName());
    }
}
