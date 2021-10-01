package org.vspaz.structural.proxy;

import org.testng.Assert;
import org.junit.Test;


public class TestProxy {
    @Test
    public void testProxyOk() {
        Proxy worker = new Proxy();
        Assert.assertEquals("this is task worker", worker.doWork());
    }
}
