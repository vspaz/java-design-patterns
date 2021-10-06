package org.vspaz.behavioral.visitor;

public class Car implements IVehicle {
  private final String city = "NYC";

  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }

  public String getStatus() {
    return city;
  }
}
