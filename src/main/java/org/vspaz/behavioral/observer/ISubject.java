package org.vspaz.behavioral.observer;

interface ISubscriber {
  void register(Observer anObserver);

  void unregister(Observer anObserver);

  String notify(int value);
}
