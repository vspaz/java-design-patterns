package org.vspaz.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestComposite {
  @Test
  void testCompositeOk() {
    CompositeEmployee EngineeringManagerUI = new CompositeEmployee("UI Engineering Manager", "UI");
    IEmployee frontendDev_1 = new Employee("dev_1", "UI");
    IEmployee frontendDev_2 = new Employee("dev_2", "UI");
    EngineeringManagerUI.addEmployee(frontendDev_1);
    EngineeringManagerUI.addEmployee(frontendDev_2);

    CompositeEmployee engineeringManagerBackend =
        new CompositeEmployee("Backend Engineering Manager", "backend");
    IEmployee backendDev_1 = new Employee("dev_3", "backend");
    IEmployee backendDev_2 = new Employee("dev_4", "backend");
    engineeringManagerBackend.addEmployee(backendDev_1);
    engineeringManagerBackend.addEmployee(backendDev_2);

    CompositeEmployee headOfEngineering = new CompositeEmployee("HeadOfEngineering", "Engineering");
    headOfEngineering.addEmployee(EngineeringManagerUI);
    headOfEngineering.addEmployee(engineeringManagerBackend);

    assertEquals(
        headOfEngineering.getHierarchy(),
        new ArrayList<>(Arrays.asList(EngineeringManagerUI, engineeringManagerBackend)));
    assertEquals(
        EngineeringManagerUI.getHierarchy(),
        new ArrayList<>(Arrays.asList(frontendDev_1, frontendDev_2)));
    assertEquals(
        engineeringManagerBackend.getHierarchy(),
        new ArrayList<>(Arrays.asList(backendDev_1, backendDev_2)));

    assertNull(frontendDev_1.getHierarchy());
    assertNull(frontendDev_2.getHierarchy());

    assertNull(backendDev_1.getHierarchy());
    assertNull(backendDev_2.getHierarchy());
  }
}
