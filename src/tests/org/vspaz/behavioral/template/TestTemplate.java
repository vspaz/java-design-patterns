package org.vspaz.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemplate {
  @Test
  void testTemplateOk() {
    Coffee coffee = new Coffee();
    assertEquals("water boiled for abstract drink", coffee.boilWater());
    assertEquals(
        "coffee's ground and brewed; sugar and milk added to coffee", coffee.prepareRecipe());
    assertEquals("abstract drink is poured into the cup", coffee.pourInCup());

    Tea tea = new Tea();
    assertEquals("water boiled for abstract drink",  tea.boilWater());
    assertEquals(
            "tea bag steeped; lemon added", tea.prepareRecipe());
    assertEquals("abstract drink is poured into the cup", tea.pourInCup());
  }
}
