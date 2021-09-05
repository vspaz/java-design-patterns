package org.vspaz.creational.strategy.ducks;

import org.vspaz.creational.strategy.fly.FlyInability;
import org.vspaz.creational.strategy.quack.Squeak;

public class RubberToy extends Duck {
    public RubberToy() {
        setFlyBehavior(new FlyInability());
        setQuackBehavior(new Squeak());
    }

    @Override
    public String describe() {
        return "I am a rubber toy duck";
    }
}

