package org.vspaz.behavioral.visitor;

public class Visitor implements IVisitor {
  @Override
  public String visit(City city) {
    return city.getName() + " visited.";
  }
}
