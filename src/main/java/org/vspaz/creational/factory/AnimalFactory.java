package org.vspaz.creational.factory;

public class AnimalFactory {
    public static IAnimal getAnimal(String animal) {
        switch (animal) {
            case "cow":
                return new Cow();
            case "wolf":
                return new Wolf();
            case "dog":
                return new Dog();
            default:
                return null;
        }
    }
}
