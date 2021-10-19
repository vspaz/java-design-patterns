package org.vspaz.behavioral.chain_of_responsibility.middleware;

public class ThrottlingMwe extends MweBase {

  private final int rps;
  private int requestCount;
  private long currentTime;

  public ThrottlingMwe(int rps) {
    this.rps = rps;
    this.currentTime = System.currentTimeMillis();
  }

  @Override
  public String check(String email, String password) {
    if (System.currentTimeMillis() > currentTime + 60_000) {
      this.requestCount = 0;
      currentTime = System.currentTimeMillis();
    }
    requestCount++;

    if (requestCount > rps) {
      return "rps limit exceeded";
    }
    return checkNext(email, password);
  }
}
