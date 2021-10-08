package org.vspaz.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements ISubscriber {
  List<Observer> observerList = new ArrayList<>();
  private int value;

  public int getValue() {
    return value;
  }

  public String update(int value) {
    this.value = value;
    return notify(value);
  }

  @Override
  public void register(Observer anObserver) {
    observerList.add(anObserver);
  }

  @Override
  public void unregister(Observer anObserver) {
    observerList.remove(anObserver);
  }

  @Override
  public String notify(int value) {
    StringBuilder observers = new StringBuilder();
    for (Observer observer : observerList) {
      observer.update(value);
      observers.append(observer.observerName);
      observers.append(" ");
    }
    return "event received; all observers updated: " + observers + ".";
  }
}
