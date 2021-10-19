package org.vspaz.behavioral.chain_of_responsibility.middleware;

public class AuthenticationMwe extends MweBase {
  @Override
  public String check(String email, String password) {
    if (email.equals("admin@example.com")) {
      return "admin";
    }
    return checkNext(email, password);
  }
}
