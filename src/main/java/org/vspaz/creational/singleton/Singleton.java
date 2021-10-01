package org.vspaz.creational.singleton;

class Singleton {
  private static Singleton singleton;
  private static int count = 0;

  private Singleton() {}

  public static int getCount() {
    return count;
  }

  public static synchronized Singleton getSingleton() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    count++;
    return singleton;
  }
}
