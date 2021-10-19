package org.vspaz.behavioral.chain_of_responsibility.middleware;

public abstract class Base {
  private Base next;

  public Base linkTo(Base next) {
    this.next = next;
    return next;
  }

  public abstract String check(String email, String password);

  protected String checkNext(String email, String password) {
    if (next == null) {
      return "";
    }
    return next.check(email, password);
  }
}
