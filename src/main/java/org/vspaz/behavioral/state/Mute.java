package org.vspaz.behavioral.state;

public class Mute implements IState {
  @Override
  public String pressOnButton(Device ctx) {
    ctx.setCurrentState(new On());
    return "'On' button pressed; switching from 'Mute' to 'On': "
        + ctx.getCurrentState().toString();
  }

  @Override
  public String pressOffButton(Device ctx) {
    ctx.setCurrentState(new Off());
    return "'Off' button pressed; switching from 'Mute' to 'Off': "
        + ctx.getCurrentState().toString();
  }

  @Override
  public String pressMuteButton(Device ctx) {
    return "'Mute' button pressed; device is already muted; 'Mute' ignored.";
  }

  public String toString() {
    return "device's muted";
  }
}
