package org.vspaz.behavioral.mediator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Mediator implements IMediator {
  List<Employee> staff = new ArrayList<>();

  @Override
  public List<Employee> register(Employee employee) {
    staff.add(employee);
    return staff;
  }

  public String getCurrentTime() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy hh:mm");
    return sdf.format(Calendar.getInstance().getTime());
  }

  @Override
  public String notify(Employee employee, String message) {
    if (staff.contains(employee)) {
      try {
        Thread.sleep(1_000);
        return String.format("'%s' posted message at %s", employee.getName(), getCurrentTime());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return String.format("unknown user '%s' tries to notify", employee.getName());
  }
}
