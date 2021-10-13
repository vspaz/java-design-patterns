package org.vspaz.behavioral.state;

public class On implements IState {
  @Override
  public String pressOnButton(Device ctx) {
    return "'On' button pressed; device is already on; 'On' ignored.";
  }

  @Override
  public String pressOffButton(Device ctx) {
    ctx.setCurrentState(new Off());
    return "'Off' button pressed; switching from 'On' to 'Off': "
        + ctx.getCurrentState().toString();
  }

  @Override
  public String pressMuteButton(Device ctx) {
    ctx.setCurrentState(new Mute());
    return "'Mute' button pressed; switching from 'On' to 'Mute': "
        + ctx.getCurrentState().toString();
  }

  @Override
  public String toString() {
    return "device's on";
  }
}
