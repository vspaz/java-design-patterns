package org.vspaz.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFacade {
  @Test
  void testFacadeOk() {
    Facade robotFacade = new Facade();
    assertEquals(
        robotFacade.buildRobot(),
        "'org.vspaz.structural.facade.robot.Body' "
            + "robot is created; steel color set; bionic arms are set; arms added; legs added");

    assertEquals(
        robotFacade.deleteRobot(),
        "arms deleted; legs deleted; 'org.vspaz.structural.facade.robot.Body' robot is deleted");
  }
}
