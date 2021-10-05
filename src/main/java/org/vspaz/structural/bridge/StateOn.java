package org.vspaz.structural.bridge;

public class StateOn implements State {
  @Override
  public String switchState() {
    return "state 'ON'";
  }

  @Override
  public String buttonPressed() {
    return "'ON' is already activated";
  }
}
