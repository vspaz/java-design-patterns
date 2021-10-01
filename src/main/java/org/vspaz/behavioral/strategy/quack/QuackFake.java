package org.vspaz.behavioral.strategy.quack;

public class QuackFake implements Quack {
    @Override
    public String quack() {
        return "Quack";
    }
}
