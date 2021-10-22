package org.vspaz.behavioral.interpreter;

public class Employee implements IEmployee {
  private final int workExperienceInYears;
  private final String currentGrade;

  public Employee(int workExperienceInYears, String currentGrade) {
    this.workExperienceInYears = workExperienceInYears;
    this.currentGrade = currentGrade;
  }

  public boolean interpret(Context ctx) {
    return this.workExperienceInYears > ctx.getWorkExperienceInYears()
        && ctx.getPermissionGrades().contains(this.currentGrade);
  }
}
