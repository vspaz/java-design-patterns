package org.vspaz.behavioral.mediator;

public class ChatUser extends User {

  public ChatUser(IMediator mediator, String name) {
    super(mediator);
    this.name = name;
  }

  @Override
  public String getEmployeeType() {
    return this.name;
  }
}
