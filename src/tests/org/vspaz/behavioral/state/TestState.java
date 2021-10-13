package org.vspaz.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestState {
  @Test
  void testStateOk() {
    Device device = new Device();
    assertEquals(
        "'Off' button pressed; device is already off; 'Off' ignored.", device.pressOffButton());
  }
}
