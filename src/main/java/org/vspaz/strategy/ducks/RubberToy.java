package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.FlyInability;
import org.vspaz.strategy.quack.Squeak;

public class RubberToy extends Duck {
    public RubberToy() {
        setFlyBehavior(new FlyInability());
        setQuackBehavior(new Squeak());
    }

    @Override
    String display() {
        return "I am a rubber toy duck";
    }
}
