package org.vspaz.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
  private int flag;

  public int getFlag() {
    return flag;
  }

  public String setFlag(int flag) {
    this.flag = flag;
    return notifyRegisteredUsers(flag);
  }

  List<Observer> observerList = new ArrayList<>();

  @Override
  public void register(Observer anObserver) {
    observerList.add(anObserver);
  }

  @Override
  public void unregister(Observer anObserver) {
    observerList.remove(anObserver);
  }

  @Override
  public String notifyRegisteredUsers(int value) {
    StringBuilder observers = new StringBuilder();
    for (Observer observer : observerList) {
      observer.update(value);
      observers.append(observer.observerName);
      observers.append(" ");
    }
    return "event received; all observers updated: " + observers + ".";
  }
}
