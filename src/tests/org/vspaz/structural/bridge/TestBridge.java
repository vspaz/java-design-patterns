package org.vspaz.structural.bridge;

import org.junit.jupiter.api.Test;
import org.vspaz.structural.bridge.states.Off;
import org.vspaz.structural.bridge.states.On;
import org.vspaz.structural.bridge.states.State;
import org.vspaz.structural.bridge.states.devices.Device;
import org.vspaz.structural.bridge.states.devices.TvSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBridge {
  @Test
  void testBridgeOk() {
    State currentState = new On();
    Device tvSet = new TvSet(currentState);
    assertEquals(tvSet.getState().onButtonPressed(), "'ON' is already activated");

    State offState = new Off();
    tvSet.setState(offState);
    assertEquals(tvSet.getState().onButtonPressed(), "'OFF' is already activated");
  }
}
