package org.vspaz.behavioral.observer;

interface ISubject {
  void register(Observer anObserver);

  void unregister(Observer anObserver);

  String notify(int value);
}
