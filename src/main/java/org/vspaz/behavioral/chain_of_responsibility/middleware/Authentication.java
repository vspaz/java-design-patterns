package org.vspaz.behavioral.chain_of_responsibility.middleware;

public class Authentication extends Middleware {
  @Override
  public String check(String email, String password) {
    if (email.equals("admin@example.com")) {
      return "admin@example.com";
    }
    return checkNext(email, password);
  }
}
