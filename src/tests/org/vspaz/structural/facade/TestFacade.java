package org.vspaz.structural.facade;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacade {
    @Test
    void testFacadeOk() {
        Facade robotFacade = new Facade();
        Assert.assertEquals(
                robotFacade.buildRobot(),
                "'org.vspaz.structural.facade.robot.Body' robot is created;steel color set;bionic arms are set;arms added;legs added");

        Assert.assertEquals(
                robotFacade.deleteRobot(),
                "arms deleted;legs deleted;'org.vspaz.structural.facade.robot.Body' robot is deleted"
        );
    }
}
