package org.vspaz.behavioral.chain_of_responsibility.middleware;

public class Authentication extends Base {
  @Override
  public String check(String email, String password) {
    if (email.equals("admin@example.com")) {
      return "admin";
    }
    return checkNext(email, password);
  }
}
