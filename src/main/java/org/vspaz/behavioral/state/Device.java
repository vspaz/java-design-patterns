package org.vspaz.behavioral.state;

public class Device {
  private IState currentState;

  public Device() {}

  public IState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(IState currentState) {
    this.currentState = currentState;
  }
}
