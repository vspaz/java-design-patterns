package org.vspaz.behavioral.visitor;

public class Visitor implements IVisitor {
  @Override
  public String visit(IPlace place) {
    return place.getName() + " visited.";
  }
}
