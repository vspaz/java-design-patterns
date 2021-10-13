package org.vspaz.behavioral.state;

public class Device {
  private IState currentState;

  public Device() {
    this.setCurrentState(new Off());
  }

  public IState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(IState currentState) {
    this.currentState = currentState;
  }

  public String pressOffButton() {
    return currentState.pressOffButton(this);
  }

  public String pressOnbutton() {
    return currentState.pressOnButton(this);
  }

  public String pressMuteButton() {
    return currentState.pressMuteButton(this);
  }
}
