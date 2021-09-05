package org.vspaz.creational.strategy.ducks;

import org.vspaz.creational.strategy.fly.FlyWithWings;

import org.vspaz.creational.strategy.quack.QuackRegular;

public class Mallard extends Duck {
    public Mallard() {
        setQuackBehavior(new QuackRegular());
        setFlyBehavior(new FlyWithWings());

    }

    @Override
    public String describe() {
        return "I am a mallard duck";
    }
}
