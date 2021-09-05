package org.vspaz.creational.strategy.quack;

public class QuackMute implements Quack {
    @Override
    public String quack() {
        return "Silence";
    }
}
