package org.vspaz.behavioral.visitor;

public class City implements IPlace {
  private final String city = "NYC";

  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }

  public String getName() {
    return city;
  }
}
