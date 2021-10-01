package org.vspaz.behavioral.strategy.ducks;

import org.vspaz.behavioral.strategy.fly.FlyInability;
import org.vspaz.behavioral.strategy.quack.Squeak;

public class RubberToy extends Duck {
  public RubberToy() {
    setFlyBehavior(new FlyInability());
    setQuackBehavior(new Squeak());
  }

  @Override
  public String describe() {
    return "I am a rubber toy duck";
  }
}
