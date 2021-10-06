package org.vspaz.behavioral.visitor;

public class Car implements IVehicle {
  private final String status = "initial status";

  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }

  public String getStatus() {
    return status;
  }
}
