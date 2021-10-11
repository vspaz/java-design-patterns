package org.vspaz.behavioral.iterator;

public interface Iterator {
  void first();

  String next();

  String getCurrent();

  boolean hasNext();
}
