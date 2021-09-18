package org.vspaz.creational.afactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAbstractFactory {
    @Test
    void testDomesticFactoryOk() {
        IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
        IAnimalae russianBlue = domesticFactory.getAnimal("russian-blue");

        Assert.assertEquals(russianBlue.makeSound(), "meow, meow");
        Assert.assertEquals(russianBlue.doAction(), "sleep on the coach");

    }

    @Test
    void testUndefDomesticAnimal() {
        IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
        Assert.expectThrows(RuntimeException.class, () -> {
            domesticFactory.getAnimal("someUndefAnimal");
        });
    }

    @Test
    void testCreateFactoryFail() {
        Assert.expectThrows(
                RuntimeException.class, () -> {
                    AnimalAbstractFactory.getAnimalFactory("someUndefFactory");
                });
    }

    @Test
    void testWildFactoryOk() {
        IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
        IAnimalae lynx = wildAnimalFactory.getAnimal("lynx");

        Assert.assertEquals(lynx.makeSound(), "growl");
        Assert.assertEquals(lynx.doAction(), "kill a wild goat");
    }

    @Test
    void testUndefWildAnimal() {
        IAnimalFactory wildAnimalFactory = AnimalAbstractFactory.getAnimalFactory("wild");
        Assert.expectThrows(RuntimeException.class, () -> {
            wildAnimalFactory.getAnimal("someUndefWildAnimal");
        });
    }
}
