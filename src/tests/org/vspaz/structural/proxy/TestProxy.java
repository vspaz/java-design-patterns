package org.vspaz.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProxy {
  @Test
  void testProxyOk() {
    Proxy worker = new Proxy();
    assertEquals("this is task worker", worker.doWork());
  }
}
