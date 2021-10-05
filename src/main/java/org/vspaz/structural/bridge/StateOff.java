package org.vspaz.structural.bridge;

public class StateOff implements State {
  @Override
  public String switchState() {
    return "state 'OFF'";
  }

  @Override
  public String buttonPressed() {
    return "'OFF' is already activated";
  }
}
