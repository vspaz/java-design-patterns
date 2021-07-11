package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.FlyWithWings;
import org.vspaz.strategy.quack.QuackRegular;

public class Mallard extends Duck {
    public Mallard() {
        setQuackBehavior(new QuackRegular());
        setFlyBehavior(new FlyWithWings());

    }

    @Override
    void display() {

    }
}
