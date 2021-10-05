package org.vspaz.structural.bridge.states;

public class On implements State {
  @Override
  public String switchState() {
    return "state 'ON'";
  }

  @Override
  public String buttonPressed() {
    return "'ON' is already activated";
  }
}
