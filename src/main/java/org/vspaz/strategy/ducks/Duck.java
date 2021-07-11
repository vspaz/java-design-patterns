package org.vspaz.strategy.ducks;

import org.vspaz.strategy.fly.Fly;
import org.vspaz.strategy.quack.Quack;

public abstract class Duck {
    Fly fly;
    Quack quack;

    public Duck() {

    }

    public void setFlyBehavior(Fly fly) {
        this.fly = fly;
    }

    public void setQuackBehavior(Quack quack) {
        this.quack = quack;
    }

    abstract void display();

    public void doFly() {
        fly.fly();
    }

    public void doQuack() {
        quack.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}