package org.vspaz.creational.singleton;

class Singleton {
    private static Singleton singleton;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        count++;
        return singleton;
    }
}
