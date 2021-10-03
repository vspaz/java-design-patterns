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
    CompositeEmployee EngineeringManagerUI = new CompositeEmployee("UI Engineering Manager", "UI");
    CompositeEmployee engineeringManager_2 =
        new CompositeEmployee("Backend Engineering Manager", "backend");

    IEmployee frontendDev_1 = new Employee("dev_1", "UI");
    IEmployee frontendDev_2 = new Employee("dev_2", "UI");

    EngineeringManagerUI.addEmployee(frontendDev_1);
    EngineeringManagerUI.addEmployee(frontendDev_2);

    engineeringManager_2.addEmployee(new Employee("dev_3", "backend"));
    engineeringManager_2.addEmployee(new Employee("dev_4", "backend"));

    CompositeEmployee headOfEngineering = new CompositeEmployee("HeadOfEngineering", "Engineering");
    headOfEngineering.addEmployee(EngineeringManagerUI);
    headOfEngineering.addEmployee(engineeringManager_2);

    List<IEmployee> engineeringManagers = new ArrayList<>();
    engineeringManagers.add(EngineeringManagerUI);
    engineeringManagers.add(engineeringManager_2);
    assertEquals(headOfEngineering.getHierarchy(), engineeringManagers);

    List<IEmployee> frontendDevs = new ArrayList<>();
    frontendDevs.add(frontendDev_1);
    frontendDevs.add(frontendDev_2);

    assertEquals(EngineeringManagerUI.getHierarchy(), frontendDevs);
  }
}
