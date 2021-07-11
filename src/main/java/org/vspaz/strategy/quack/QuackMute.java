package org.vspaz.strategy.quack;

public class QuackMute implements Quack {
    @Override
    public void quack() {
        System.out.println("Silence.");
    }
}
