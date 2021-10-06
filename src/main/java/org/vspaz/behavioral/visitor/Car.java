package org.vspaz.behavioral.visitor;

public class Car implements IVehicle {
  @Override
  public String acceptVisitor(IVisitor visitor) {
    return visitor.visit(this);
  }
}
