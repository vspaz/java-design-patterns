package org.vspaz.behavioral.chain_of_responsibility.middleware;

public class Authentication extends Middleware {
  @Override
  public String check(String email, String password) {
    switch (email) {
      case "admin@example.com":
        return "admin@example.com";
      case "user@example.com":
        return "user@example.com";
      default:
        return checkNext(email, password);
    }
  }
}
