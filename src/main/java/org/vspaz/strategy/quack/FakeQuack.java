package org.vspaz.strategy.quack;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
