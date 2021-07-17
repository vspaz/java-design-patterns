package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.FlyWithWings;
import org.vspaz.strategy.quack.QuackRegular;

public class RedHead extends Duck {
    public RedHead() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackRegular());
    }

    @Override
    String display() {
        return "I am a real read head duck";
    }
}
