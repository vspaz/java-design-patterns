package org.vspaz.structural.proxy;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestProxy {
    @Test
    void testProxyOk() {
        Proxy worker = new Proxy();
        Assert.assertEquals("this is task worker", worker.doWork());
    }
}
