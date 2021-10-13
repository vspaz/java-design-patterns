package org.vspaz.behavioral.state;

public interface IState {
  String pressOnButton(Device ctx);

  String pressOffButton(Device ctx);

  String pressMuteButton(Device ctx);
}
