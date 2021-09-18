package org.vspaz.creational.afactory;

public class DomesticAnimalFactory {
    public static IAnimalae getAnimal(String species) {
        switch (species) {
            case "russian-blue":
                return new RussianBlue();
            case "dachshund":
                return new Dachshund();
            default:
                throw new RuntimeException("undefined species" + species);
        }
    }
}
