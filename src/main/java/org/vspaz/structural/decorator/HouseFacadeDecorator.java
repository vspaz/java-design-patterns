package org.vspaz.structural.decorator;

public class HouseFacadeDecorator extends BaseDecorator {
  @Override
  public String buildHouse() {
    return super.buildHouse() + addBrickFacade();
  }

  private String addBrickFacade() {
    return "; brick facade added";
  }
}
