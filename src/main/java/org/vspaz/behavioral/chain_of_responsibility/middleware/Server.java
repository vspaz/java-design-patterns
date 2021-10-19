package org.vspaz.behavioral.chain_of_responsibility.middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
  private Map<String, String> emailToPassword = new HashMap<>();
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
}
