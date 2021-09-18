package org.vspaz.creational.afactory;

public class AnimalAbstractFactory {
    public static IAnimalFactory getAnimalFactory(String factoryType) {
        switch (factoryType) {
            case "domestic":
                return new DomesticAnimalFactory();
            case "wild":
                return new WildAnimalFactory();
            default:
                throw new RuntimeException(String.format("factory '%s' undefined", factoryType));
        }
    }
}
