package org.vspaz.behavioral.mediator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Mediator implements IMediator {
  List<User> chatRoom = new ArrayList<>();

  @Override
  public List<User> register(User employee) {
    chatRoom.add(employee);
    return chatRoom;
  }

  public String getCurrentTime() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy hh:mm");
    return sdf.format(Calendar.getInstance().getTime());
  }

  @Override
  public String notify(User employee, String message) {
    if (chatRoom.contains(employee)) {
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
