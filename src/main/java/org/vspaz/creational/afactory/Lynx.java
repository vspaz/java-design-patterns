package org.vspaz.creational.afactory;

public class Lynx implements IFeline {
    @Override
    public String makeSound() {
        return "growl";
    }

    @Override
    public String doAction() {
        return "kill a wild goat";
    }
}
