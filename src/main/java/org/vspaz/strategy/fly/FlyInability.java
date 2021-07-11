package org.vspaz.strategy.fly;

public class FlyInability implements Fly {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
