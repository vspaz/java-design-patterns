package org.vspaz.singleton;

class Singleton {
    private static Singleton singleton;
    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
