package org.vspaz.behavioral.visitor;

public class City implements ICity {
  private final String city = "NYC";

  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }

  public String getName() {
    return city;
  }
}
