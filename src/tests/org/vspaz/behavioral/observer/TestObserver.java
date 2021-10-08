package org.vspaz.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObserver {
  @Test
  void testObserverOk() {
    Observer observer_1 = new Observer("observer_1");
    Observer observer_2 = new Observer("observer_2");

    Subject subject = new Subject();
    subject.register(observer_1);
    subject.register(observer_2);

    assertEquals("event received; all observers updated: observer_1 observer_2 .", subject.setFlag(100));
  }
}
