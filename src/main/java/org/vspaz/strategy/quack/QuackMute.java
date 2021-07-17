package org.vspaz.strategy.quack;

public class QuackMute implements Quack {
    @Override
    public String quack() {
        return "Silence";
    }
}
