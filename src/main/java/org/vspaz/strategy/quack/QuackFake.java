package org.vspaz.strategy.quack;

public class QuackFake implements Quack {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
