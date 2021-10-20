package org.vspaz.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {
  private final int workExperienceInYears;
  private final List<String> permissionGrades;

  public Context(int workExperienceInYears, String... allowedGrades) {
    this.workExperienceInYears = workExperienceInYears;
    this.permissionGrades = new ArrayList<>();
    permissionGrades.addAll(Arrays.asList(allowedGrades));
  }

  public int getWorkExperienceInYears() {
    return workExperienceInYears;
  }

  public List<String> getPermissionGrades() {
    return permissionGrades;
  }
}
