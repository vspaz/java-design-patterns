package org.vspaz.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {
  @Test
  void testObserverOk() {
    Subject subject = new Subject();
    String observerName = "observer_1";
    Observer observer = new Observer(observerName);
    subject.register(new Observer(observerName));
    assertEquals(
        "event received; all observers updated: " + observerName + " .", subject.setFlag(100));
    subject.unregister(observer);
  }
}
