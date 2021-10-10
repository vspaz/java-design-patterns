package org.vspaz.behavioral.command;

public class Invoker {
  ICommand command;

  public Invoker(ICommand command) {
    this.command = command;
  }

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public String runCommand() {
    return command.runCommand();
  }
}
