package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.FlyInability;
import org.vspaz.strategy.quack.QuackMute;

public class Decoy extends Duck {
    public Decoy() {
        setFlyBehavior(new FlyInability());
        setQuackBehavior(new QuackMute());
    }

    @Override
    public String describe() {
        return "I'm a decoy duck";
    }
}
