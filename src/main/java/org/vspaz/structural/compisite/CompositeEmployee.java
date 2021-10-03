package org.vspaz.structural.compisite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {

  private final int employeeCount = 0;
  private final String name;
  private final String department;
  private final List<IEmployee> directReports;

  public CompositeEmployee(String name, String department) {
    this.name = name;
    this.department = department;
    directReports = new ArrayList<>();
  }

  public void addEmployee(IEmployee employee) {
    directReports.add(employee);
  }

  public void removeEmployee(IEmployee employee) {
    directReports.remove(employee);
  }

  @Override
  public List<IEmployee> getHierarchy() {
    return directReports;
  }

  @Override
  public int getCount() {
    int employeeCount = 0;
    for (IEmployee employee : directReports) {
      employeeCount += employee.getCount();
    }
    return employeeCount + directReports.size();
  }
}
