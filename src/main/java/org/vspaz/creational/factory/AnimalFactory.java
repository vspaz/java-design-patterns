package org.vspaz.creational.factory;

public class AnimalFactory {
    public static IAnimal getAnimal(String animal) {
        return switch (animal) {
            case "cow" -> new Cow();
            case "wolf" -> new Wolf();
            case "dog" -> new Dog();
            default -> null;
        };
    }
}
