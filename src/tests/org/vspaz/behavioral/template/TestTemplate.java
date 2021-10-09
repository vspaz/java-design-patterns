package org.vspaz.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestTemplate {
  @Test
  void testTemplateOk() {
    Coffee coffee = new Coffee();
    assertEquals("water boiled", coffee.boilWater());
    assertEquals("coffee brewed; sugar and milk added to coffee", coffee.prepareRecipe());
    assertEquals("poured into cup", coffee.pourInCup());

    Tea tea = new Tea();
    assertEquals("water boiled", tea.boilWater());
    assertEquals("tea bag steeped; lemon added", tea.prepareRecipe());
    assertEquals("poured into cup", tea.pourInCup());

    assertEquals(coffee.boilWater(), tea.boilWater());
    assertNotEquals(coffee.prepareRecipe(), tea.prepareRecipe());
    assertEquals(coffee.pourInCup(), tea.pourInCup());
  }
}
