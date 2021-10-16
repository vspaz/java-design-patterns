package org.vspaz.behavioral.mediator;

public class DevOps extends Employee {

  public DevOps(IMediator mediator, String name) {
    super(mediator);
    this.name = name;
  }

  @Override
  public String getEmployeeType() {
    return "DevOps";
  }
}
