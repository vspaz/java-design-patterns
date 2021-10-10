package org.vspaz.behavioral.command;

public class Redo implements ICommand {
  private final Receiver receiver;

  public Redo(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public String runCommand() {
    return receiver.runRedo();
  }
}
