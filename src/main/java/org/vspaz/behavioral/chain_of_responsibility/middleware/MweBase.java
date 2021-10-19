package org.vspaz.behavioral.chain_of_responsibility.middleware;

public abstract class MweBase {
  private MweBase next;

  public MweBase linkTo(MweBase next) {
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
