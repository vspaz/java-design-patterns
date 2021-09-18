package org.vspaz.creational.afactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAbstractFactory {
    @Test
    void testDomesticFactoryOk() {
        IAnimalFactory domesticFactory = AnimalAbstractFactory.getAnimalFactory("domestic");
        IAnimalae domesticCat = domesticFactory.getAnimal("russian-blue");

        Assert.assertEquals(domesticCat.makeSound(), "meow, meow");
        Assert.assertEquals(domesticCat.doAction(), "sleep on the coach");

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
}
