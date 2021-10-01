package org.vspaz.creational.singleton;

import org.testng.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingletonOk() {
        Singleton singleton_1 = Singleton.getSingleton();
        Singleton singleton_2 = Singleton.getSingleton();
        Assert.assertEquals(singleton_1, singleton_2);

        Assert.assertEquals(2, Singleton.getCount());
    }
}
