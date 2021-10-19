package org.vspaz.behavioral.chain_of_responsibility.server;

import org.vspaz.behavioral.chain_of_responsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
  private final Map<String, String> emailToPassword = new HashMap<>();
  private Middleware middleware;

  public void setMiddleware(Middleware middleware) {
    this.middleware = middleware;
  }

  public String logIn(String email, String password) {
    if ("admin@example.com".equals(middleware.check(email, password))) {
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
