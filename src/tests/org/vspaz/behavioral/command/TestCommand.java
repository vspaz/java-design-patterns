package org.vspaz.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCommand {
  @Test
  void testCommandOk() {
    Receiver receiver = new Receiver();
    Undo undoCmd = new Undo(receiver);
    Invoker caller = new Invoker(undoCmd);
    assertEquals("'undo' run by receiver", caller.runCommand());

    Redo redoCmd = new Redo(receiver);
    caller.setCommand(redoCmd);

    assertEquals("'redo' run by receiver", caller.runCommand());
  }
}
