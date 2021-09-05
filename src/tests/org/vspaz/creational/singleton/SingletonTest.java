package org.vspaz.creational.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    void testSingletonOk() {
        Singleton singleton_1 = Singleton.getSingleton();
        Singleton singleton_2 = Singleton.getSingleton();
        Assert.assertEquals(singleton_1, singleton_2);

        Assert.assertEquals(2, Singleton.getCount());
    }
}
