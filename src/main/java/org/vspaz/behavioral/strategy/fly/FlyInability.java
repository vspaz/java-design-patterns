package org.vspaz.behavioral.strategy.fly;

public class FlyInability implements Fly {
  @Override
  public String fly() {
    return "can't fly";
  }
}
