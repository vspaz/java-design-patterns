package org.vspaz.behavioral.mediator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
  List<Employee> staff = new ArrayList<>();

  @Override
  public List<Employee> register(Employee employee) {
    staff.add(employee);
    return staff;
  }

  @Override
  public String notify(Employee employee, String message) {
    if (staff.contains(employee)) {
      try {
        Thread.sleep(1_000);
        return String.format("'%s' posted message at %s", employee.getName(), LocalDateTime.now());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return String.format("'%s' tries to notify", employee.getName());
  }
}
