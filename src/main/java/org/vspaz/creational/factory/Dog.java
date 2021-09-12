package org.vspaz.creational.factory;

public class Dog implements IAnimal {
    @Override
    public String makeSound() {
        return "yup, yup";
    }

    @Override
    public String getFood() {
        return "wag tail";
    }
}
