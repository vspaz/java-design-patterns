package org.vspaz.behavioral.chain_of_responsibility.server;

import org.vspaz.behavioral.chain_of_responsibility.middleware.Base;

import java.util.HashMap;
import java.util.Map;

public class Server {
  private final Map<String, String> emailToPassword = new HashMap<>();
  private Base middleware;

  public void setMiddleware(Base middleware) {
    this.middleware = middleware;
  }

  public String logIn(String email, String password) {
    if ("authorized".equals(middleware.check(email, password))) {
      return "user authorized";
    }
    return "user unauthorized";
  }

  public void register(String email, String password) {
    emailToPassword.put(email, password);
  }

  public boolean hasEmail(String email) {
    return emailToPassword.containsKey(email);
  }

  public boolean isPasswordValid(String email, String password) {
    return emailToPassword.get(email).equals(password);
  }
}
