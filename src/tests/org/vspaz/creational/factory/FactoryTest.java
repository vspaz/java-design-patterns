package org.vspaz.creational.factory;

import org.testng.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testCowOk() {
        IAnimal cow = AnimalFactory.getAnimal("cow");
        Assert.assertNotNull(cow);
        Assert.assertEquals(cow.getFood(), "grazing");
        Assert.assertEquals(cow.makeSound(), "mu...");
    }

    @Test
    public void testAnimalUndefined() {
        IAnimal someUndefAnimal = AnimalFactory.getAnimal("undef");
        Assert.assertNull(someUndefAnimal);
    }

    @Test
    public void testWulfOk() {
        Wolf wolf = (Wolf) AnimalFactory.getAnimal("wolf");
        Assert.assertNotNull(wolf);
        Assert.assertEquals(wolf.getFood(), "attack prey");
        Assert.assertEquals(wolf.makeSound(), "growl");
    }
}
