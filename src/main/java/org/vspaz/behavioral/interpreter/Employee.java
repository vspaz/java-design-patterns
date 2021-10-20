package org.vspaz.behavioral.interpreter;

public class Employee implements IEmployee {
  private int workExperienceInYears;
  private String currentGrade;

  public boolean interpret(Context ctx) {
    return this.workExperienceInYears > ctx.getWorkExperienceInYears()
        && ctx.getPermissionGrades().contains(this.currentGrade);
  }
}
