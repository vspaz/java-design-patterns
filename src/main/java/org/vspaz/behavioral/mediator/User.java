package org.vspaz.behavioral.mediator;

abstract class User {
  protected IMediator mediator;
  protected String name;

  public User(IMediator mediator) {
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

  public String notify(String message) {
    return mediator.notify(this, message);
  }

  public abstract String getEmployeeType();
}
