package org.vspaz.structural.bridge.states.devices;

import org.vspaz.structural.bridge.states.State;

public class Device {
  protected State state;

  public Device(State state) {
    setState(state);
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public String switchState() {
    return "the devis is in " + state.switchState();
  }

  public String onButtonPressed() {
    return state.onButtonPressed();
  }
}
