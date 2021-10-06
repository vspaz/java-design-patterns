package org.vspaz.behavioral.visitor;

public class Village implements IPlace {
  private final String village = "in the middle of nowhere";

  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }

  public String getName() {
    return village;
  }
}
