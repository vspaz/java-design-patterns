package org.vspaz.behavioral.observer;

public class Observer implements IObserver {
  String observerName;

  public Observer(String name) {
    this.observerName = name;
  }

  @Override
  public String update(int value) {
    return String.format("update triggered '%d'", value);
  }
}
