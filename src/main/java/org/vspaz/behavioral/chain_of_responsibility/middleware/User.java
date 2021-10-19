package org.vspaz.behavioral.chain_of_responsibility.middleware;

import org.vspaz.behavioral.chain_of_responsibility.server.Server;

public class User extends Base {
  private final Server server;

  public User(Server server) {
    this.server = server;
  }

  @Override
  public String check(String email, String password) {
    if (!server.hasEmail(email)) {
      return "email not found";
    }
    if (!server.isPasswordValid(email, password)) {
      return "password incorrect";
    }
    return checkNext(email, password);
  }
}
