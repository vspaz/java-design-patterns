package org.vspaz.prototype;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrototypeTest {
    @Test
    void testPrototypeOK() throws CloneNotSupportedException {
        Tesla tesla_1 = new Tesla("m1");
        CarBase tesla_2 = tesla_1.clone();
        Assert.assertEquals(tesla_1.getModelName(), tesla_2.getModelName());
    }
}
