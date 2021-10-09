package org.vspaz.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemplate {
  @Test
  void testTemplateOk() {
    Coffee coffee = new Coffee();
    assertEquals("water boiled for abstract drink", coffee.boilWater());
  }
}
