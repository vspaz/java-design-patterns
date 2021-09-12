package org.vspaz.creational.factory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryTest {
    @Test
    void testCowOk() {
        IAnimal cow = AnimalFactory.getAnimal("cow");
        Assert.assertNotNull(cow);
        Assert.assertEquals(cow.getFood(), "grazing");
        Assert.assertEquals(cow.makeSound(), "mu...");
    }

    @Test
    void testAnimalUndefined() {
        IAnimal someUndefAnimal = AnimalFactory.getAnimal("undef");
        Assert.assertNull(someUndefAnimal);
    }

    @Test
    void testWulfOk() {
        Wolf wolf = (Wolf) AnimalFactory.getAnimal("wolf");
        Assert.assertNotNull(wolf);
        Assert.assertEquals(wolf.getFood(), "attack prey");
        Assert.assertEquals(wolf.makeSound(), "growl");
    }
}
