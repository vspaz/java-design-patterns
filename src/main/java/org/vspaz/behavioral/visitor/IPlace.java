package org.vspaz.behavioral.visitor;

interface IPlace {
  String acceptVisitor(IVisitor visitor);

  String getName();
}
