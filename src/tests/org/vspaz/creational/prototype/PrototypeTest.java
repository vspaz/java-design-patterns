package org.vspaz.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeTest {
  @Test
  void testPrototypeOK() throws CloneNotSupportedException {
    Tesla tesla_1 = new Tesla("m1");
    CarBase tesla_2 = tesla_1.clone();
    assertEquals(tesla_1.getModelName(), tesla_2.getModelName());

    tesla_2.setModelName("m2");
    assertEquals(tesla_2.getModelName(), "m2");
    assertNotEquals(tesla_1.getModelName(), tesla_2.getModelName());
  }
}
