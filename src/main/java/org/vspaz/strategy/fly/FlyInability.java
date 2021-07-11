package org.vspaz.strategy.fly;

import org.vspaz.strategy.fly.FlyBehavior;

public class FlyInability implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
