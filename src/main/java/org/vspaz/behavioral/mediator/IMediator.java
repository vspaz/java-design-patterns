package org.vspaz.behavioral.mediator;

public interface IMediator {
  void register(Employee employee);

  void notify(Employee employee, String message);
}
