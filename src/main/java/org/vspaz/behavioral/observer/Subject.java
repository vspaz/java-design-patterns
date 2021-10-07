package org.vspaz.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
  private int flag;

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
    notifyRegisteredUsers(flag);
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
  public void notifyRegisteredUsers(int value) {
    for (Observer observer : observerList) {
      observer.update(value);
    }
  }
}
