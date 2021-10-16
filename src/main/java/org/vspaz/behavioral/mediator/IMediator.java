package org.vspaz.behavioral.mediator;

import java.util.List;

public interface IMediator {
  List<User> register(User employee);

  String notify(User employee, String message);
}
