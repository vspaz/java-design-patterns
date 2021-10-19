package org.vspaz.behavioral.chain_of_responsibility.middleware;

public abstract class Middleware {
  private Middleware next;

  public Middleware linkTo(Middleware next) {
    this.next = next;
    return next;
  }

  public abstract boolean check(String email, String password);

  protected boolean checkNext(String email, String password) {
    if (next == null) {
      return true;
    }
    return next.check(email, password);
  }
}
