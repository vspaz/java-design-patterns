package org.vspaz.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {
  @Test
  void testSingletonOk() {
    Singleton singleton_1 = Singleton.getSingleton();
    Singleton singleton_2 = Singleton.getSingleton();
    assertEquals(singleton_1, singleton_2);

    assertEquals(2, Singleton.getCount());
  }
}
