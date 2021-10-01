package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.FlyWithWings;
import org.vspaz.behavioral.strategy.quack.QuackRegular;

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
