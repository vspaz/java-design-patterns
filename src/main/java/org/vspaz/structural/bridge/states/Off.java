package org.vspaz.structural.bridge.states;

public class Off implements State {
  @Override
  public String switchState() {
    return "state 'OFF'";
  }

  @Override
  public String onButtonPressed() {
    return "'OFF' is already activated";
  }
}
