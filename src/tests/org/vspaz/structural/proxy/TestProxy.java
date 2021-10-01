package org.vspaz.structural.proxy;

import org.junit.Test;
import org.testng.Assert;

public class TestProxy {
  @Test
  public void testProxyOk() {
    Proxy worker = new Proxy();
    Assert.assertEquals("this is task worker", worker.doWork());
  }
}
