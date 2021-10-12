package org.vspaz.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMemento {
  @Test
  void testMementoOk() {
    Originator originator = new Originator();
    originator.setId(10);
    assertEquals(10, originator.getId());
    Memento memento = originator.save(originator.getId());
    originator.setId(100500);
    assertEquals(100500, originator.getId());
    originator.revert(memento);

    assertEquals(originator.getId(), 10);
  }
}
