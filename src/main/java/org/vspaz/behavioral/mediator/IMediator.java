package org.vspaz.behavioral.mediator;

import java.util.List;

public interface IMediator {
  List<Employee> register(Employee employee);

  String notify(Employee employee, String message);
}
