package org.vspaz.structural.bridge.states;

public class Off implements State {
  @Override
  public String switchState() {
    return "state 'OFF'";
  }

  @Override
  public String buttonPressed() {
    return "'OFF' is already activated";
  }
}
