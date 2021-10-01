package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.FlyInability;
import org.vspaz.behavioral.strategy.quack.QuackRegular;

public class Model extends Duck {
  public Model() {
    setFlyBehavior(new FlyInability());
    setQuackBehavior(new QuackRegular());
  }

  @Override
  public String describe() {
    return "I am a model duck";
  }
}
