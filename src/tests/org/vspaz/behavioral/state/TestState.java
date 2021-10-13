package org.vspaz.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestState {
  @Test
  void testStateOk() {
    Device device = new Device();
    String initialState = "'Off' button pressed; device is already off; 'Off' ignored.";
    assertEquals(initialState, device.pressOffButton());
    assertEquals("device's off.", device.getCurrentState().toString());

    assertEquals(
        "'On' button pressed; switching from 'Off' to 'On': device's on.", device.pressOnButton());
    assertEquals(
        "'Mute' button pressed; switching from 'On' to 'Mute': device's muted.",
        device.pressMuteButton());
    assertEquals(
        "'Off' button pressed; switching from 'Mute' to 'Off': device's off.",
        device.pressOffButton());
    assertEquals(initialState, device.pressOffButton());
  }
}
