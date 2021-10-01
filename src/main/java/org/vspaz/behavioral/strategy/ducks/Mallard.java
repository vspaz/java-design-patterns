package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.FlyWithWings;

import org.vspaz.behavioral.strategy.quack.QuackRegular;

public class Mallard extends Duck {
  public Mallard() {
    setQuackBehavior(new QuackRegular());
    setFlyBehavior(new FlyWithWings());
  }

  @Override
  public String describe() {
    return "I am a mallard duck";
  }
}
