package org.vspaz.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {
  @Test
  void testObserverOk() {
    Subject subject = new Subject();
    StringBuilder registeredObservers = new StringBuilder();
    for (int i = 1; i <= 10; i++) {
      String observerName = "observer_" + i;
      subject.register(new Observer(observerName));
      registeredObservers.append(observerName);
      registeredObservers.append(" ");
    }
    assertEquals(
            "event received; all observers updated: " + registeredObservers + ".", subject.setFlag(100));
  }
}
