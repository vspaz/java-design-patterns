package org.vspaz.behavioral.interpreter.expressions;

import org.vspaz.behavioral.interpreter.Context;
import org.vspaz.behavioral.interpreter.IEmployee;

public class Not implements IEmployee {

  private final IEmployee employee;

  public Not(IEmployee employee) {
    this.employee = employee;
  }

  @Override
  public boolean interpret(Context ctx) {
    return !employee.interpret(ctx);
  }
}
