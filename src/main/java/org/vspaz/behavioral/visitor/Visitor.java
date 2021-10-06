package org.vspaz.behavioral.visitor;

public class Visitor implements IVisitor {
  @Override
  public String visit(Car car) {
    return car.getStatus() + " visited.";
  }
}
