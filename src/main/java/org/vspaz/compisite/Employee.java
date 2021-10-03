package org.vspaz.compisite;

import java.util.List;

public class Employee implements IEmployee {
  private final String name;
  private final String department;

  public Employee(String name, String department) {
    this.name = name;
    this.department = department;
  }

  @Override
  public List<IEmployee> getHierarchy() {
    return null;
  }

  @Override
  public int getCount() {
    return 0;
  }
}
