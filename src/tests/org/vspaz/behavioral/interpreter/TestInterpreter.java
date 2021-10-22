package org.vspaz.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInterpreter {
  @Test
  void testInterpreterOk() {
    Context ctx = new Context(10, "G2", "G3");
    IEmployee employee_1 = new Employee(1, "G1");
    IEmployee employee_2 = new Employee(11, "G2");

    assertTrue(EmployeeFactory.getExpression(employee_1, employee_2, "or").interpret(ctx));
  }
}
