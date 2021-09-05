package org.vspaz.creational.strategy.ducks;

import org.vspaz.creational.strategy.fly.FlyWithWings;
import org.vspaz.creational.strategy.quack.QuackRegular;

public class RedHead extends Duck {
    public RedHead() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackRegular());
    }

    @Override
    public String describe() {
        return "I am a real read head duck";
    }
}
