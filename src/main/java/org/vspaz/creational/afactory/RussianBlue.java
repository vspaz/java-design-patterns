package org.vspaz.creational.afactory;

public class RussianBlue implements ICanine{
    @Override
    public String makeSound() {
        return "meow, meow";
    }

    @Override
    public String doAction() {
        return "sleep on the coach";
    }
}
