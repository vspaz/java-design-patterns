package org.vspaz.behavioral.template;

public class Tea extends CaffeineDrink {
  @Override
  public String prepareRecipe() {
    return steepTeaBag() + " " + addLemon();
  }

  public String steepTeaBag() {
    return "tea bag steeped";
  }

  public String addLemon() {
    return "lemon added";
  }
}
