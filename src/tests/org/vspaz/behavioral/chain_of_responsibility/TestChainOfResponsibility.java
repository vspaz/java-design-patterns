package org.vspaz.behavioral.chain_of_responsibility;

import org.junit.jupiter.api.Test;
import org.vspaz.behavioral.chain_of_responsibility.middleware.Authentication;
import org.vspaz.behavioral.chain_of_responsibility.middleware.Middleware;
import org.vspaz.behavioral.chain_of_responsibility.middleware.Throttling;
import org.vspaz.behavioral.chain_of_responsibility.middleware.User;
import org.vspaz.behavioral.chain_of_responsibility.server.Server;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChainOfResponsibility {
  @Test
  void testChainOfResponsibilityOk() {
    Server server = new Server();
    server.register("admin@example.com", "admin");
    server.register("user@example.com", "12345");

    Middleware mwe = new Throttling(3);
    mwe.linkTo(new User(server));
    mwe.linkTo(new Authentication());
    server.setMiddleware(mwe);

    assertEquals("user authorized", server.logIn("admin@example.com", "bar"));
  }
}
