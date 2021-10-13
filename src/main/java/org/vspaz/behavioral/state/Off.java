package org.vspaz.behavioral.state;

public class Off implements IState {
  @Override
  public String pressOnButton(Device ctx) {
    ctx.setCurrentState(new On());
    return "'On' button pressed; switching from 'Off' to 'On': " + ctx.getCurrentState().toString();
  }

  @Override
  public String pressOffButton(Device ctx) {
    return "'Off' button pressed; device is already off; 'Off' ignored.";
  }

  @Override
  public String pressMuteButton(Device ctx) {
    return "'Off' button pressed; device is already off; 'Mute' ignored.";
  }

  @Override
  public String toString() {
    return "device's fff";
  }
}
