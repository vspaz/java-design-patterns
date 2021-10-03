package org.vspaz.structural.composite;

import org.junit.jupiter.api.Test;
import org.vspaz.structural.compisite.CompositeEmployee;
import org.vspaz.structural.compisite.Employee;
import org.vspaz.structural.compisite.IEmployee;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComposite {
  @Test
  void testCompositeOk() {
    CompositeEmployee engineeringManager_1 = new CompositeEmployee("UI Engineering Manager", "UI");
    CompositeEmployee engineeringManager_2 =
        new CompositeEmployee("Backend Engineering Manager", "backend");

    engineeringManager_1.addEmployee(new Employee("dev_1", "UI"));
    engineeringManager_1.addEmployee(new Employee("dev_2", "UI"));

    engineeringManager_2.addEmployee(new Employee("dev_3", "backend"));
    engineeringManager_2.addEmployee(new Employee("dev_4", "backend"));

    CompositeEmployee headOfEngineering = new CompositeEmployee("HeadOfengineering", "Engineering");
    headOfEngineering.addEmployee(engineeringManager_1);
    headOfEngineering.addEmployee(engineeringManager_2);
    List<IEmployee> engineeringManagers = new ArrayList<>();
    engineeringManagers.add(engineeringManager_1);
    engineeringManagers.add(engineeringManager_2);
    assertEquals(headOfEngineering.getHierarchy(), engineeringManagers);

  }
}
