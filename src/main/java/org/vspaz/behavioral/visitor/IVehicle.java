package org.vspaz.behavioral.visitor;

interface IVehicle {
  String acceptVisitor(IVisitor visitor);
}
