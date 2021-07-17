package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.FlyInability;
import org.vspaz.strategy.quack.QuackRegular;

public class Model extends Duck{
    public Model() {
        setFlyBehavior(new FlyInability());
        setQuackBehavior(new QuackRegular());
    }

    @Override
    public String describe() {
        return "I am a model duck";
    }
}
