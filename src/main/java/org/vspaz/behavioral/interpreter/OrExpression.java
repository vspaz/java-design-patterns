package org.vspaz.behavioral.interpreter;

public class OrExpression implements IEmployee {
  private final IEmployee employee_1;
  private final IEmployee employee_2;

  public OrExpression(IEmployee employee_1, IEmployee employee_2) {
    this.employee_1 = employee_1;
    this.employee_2 = employee_2;
  }

  @Override
  public boolean interpret(Context ctx) {
    return employee_1.interpret(ctx) || employee_2.interpret(ctx);
  }
}
