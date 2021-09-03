package org.vspaz.singleton;

public class Singleton {
    private static Singleton singleton;

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
