package org.vspaz.behavioral.mediator;

public class Sre extends Employee {
  public Sre(IMediator mediator, String name) {
    super(mediator);
    this.name = name;
  }

  @Override
  public String getEmployeeType() {
    return "Sre";
  }
}
