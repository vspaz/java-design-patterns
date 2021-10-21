package org.vspaz.behavioral.interpreter;

import org.vspaz.behavioral.interpreter.expressions.And;
import org.vspaz.behavioral.interpreter.expressions.Not;
import org.vspaz.behavioral.interpreter.expressions.Or;

public class EmployeeFactory {
  public static IEmployee getExpression(
      IEmployee employee_1, IEmployee employee_2, String expression) {
    switch (expression.toLowerCase()) {
      case "or":
        return new Or(employee_1, employee_2);
      case "and":
        return new And(employee_1, employee_2);
      case "not":
        return new Not(employee_1);
      default:
        return null;
    }
  }
}
