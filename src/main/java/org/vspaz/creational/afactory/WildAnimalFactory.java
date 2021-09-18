package org.vspaz.creational.afactory;

public class WildAnimalFactory implements IAnimalFactory {
    public IAnimalae getAnimal(String species) {
        switch (species) {
            case "lynx":
                return new Lynx();
            case "wolf":
                return new Wolf();
            default:
                throw new RuntimeException(String.format("'%s' undefined", species));
        }
    }
}
