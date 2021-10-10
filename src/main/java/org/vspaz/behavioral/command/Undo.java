package org.vspaz.behavioral.command;

public class Undo implements ICommand {
  private final Receiver receiver;

  public Undo(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public String runCommand() {
    return receiver.runUndo();
  }
}
