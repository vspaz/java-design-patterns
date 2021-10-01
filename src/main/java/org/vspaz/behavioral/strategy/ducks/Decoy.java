package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.FlyInability;
import org.vspaz.behavioral.strategy.quack.QuackMute;

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
