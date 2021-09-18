package org.vspaz.creational.afactory;

public class Wolf implements ICanine {
    @Override
    public String makeSound() {
        return "growl";
    }

    @Override
    public String doAction() {
        return "kill a deer";
    }
}
