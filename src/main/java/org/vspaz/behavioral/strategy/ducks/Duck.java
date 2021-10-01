package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.Fly;
import org.vspaz.behavioral.strategy.quack.Quack;

public abstract class Duck {
  Fly fly;
  Quack quack;

  public Duck() {}

  public void setFlyBehavior(Fly fly) {
    this.fly = fly;
  }

  public void setQuackBehavior(Quack quack) {
    this.quack = quack;
  }

  abstract String describe();

  public String doFly() {
    return fly.fly();
  }

  public String doQuack() {
    return quack.quack();
  }

  public String swim() {
    return "All ducks float, even decoys";
  }
}
