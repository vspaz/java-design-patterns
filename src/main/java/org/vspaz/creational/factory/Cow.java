package org.vspaz.creational.factory;

public class Cow implements IAnimal {
    @Override
    public String makeSound() {
        return "mu...";
    }

    @Override
    public String getFood() {
        return "grazing";
    }
}
