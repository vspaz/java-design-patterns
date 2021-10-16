package org.vspaz.behavioral.mediator;

public class Ops extends Employee {
  public Ops(IMediator mediator, String name) {
    super(mediator);
    this.name = name;
  }

  @Override
  public String getEmployeeType() {
    return "Ops";
  }
}
