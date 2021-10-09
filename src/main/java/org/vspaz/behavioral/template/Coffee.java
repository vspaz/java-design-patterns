package org.vspaz.behavioral.template;

public class Coffee extends CaffeineDrink {
  @Override
  public String prepareRecipe() {
    return brewCoffeeGrinds() + " " + addSugarAndMilk();
  }

  public String brewCoffeeGrinds() {
    return "coffee's ground and brewed";
  }

  public String addSugarAndMilk() {
    return "sugar and milk added to coffee";
  }
}
