package org.vspaz.behavioral.mediator;

abstract class Employee {
  protected IMediator mediator;
  protected String name;

  public Employee(IMediator mediator) {
    this.mediator = mediator;
  }

  public IMediator getMediator() {
    return mediator;
  }

  public void setMediator(IMediator mediator) {
    this.mediator = mediator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void notify(String message) {
    mediator.notify(this, message);
  }

  public abstract String getEmployeeType();
}
