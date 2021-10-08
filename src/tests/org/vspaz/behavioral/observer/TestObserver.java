package org.vspaz.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {
  @Test
  void testObserverOk() {
    Subscriber subscriber = new Subscriber();
    String observerName = "observer_1";
    Observer observer = new Observer(observerName);
    subscriber.register(new Observer(observerName));
    assertEquals(
        "event received; all observers updated: " + observerName + " .", subscriber.update(100));
    subscriber.unregister(observer);
  }
}
