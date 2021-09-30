package org.vspaz.structural.facade;

import org.vspaz.structural.facade.robot.Arms;
import org.vspaz.structural.facade.robot.Body;
import org.vspaz.structural.facade.robot.Color;

public class Facade {
    Body body;
    Color color;
    Arms arms;

    public Facade() {
        body = new Body();
        color = new Color();
        arms = new Arms();
    }

    public String buildRobot() {
        return String.join("; ", body.createRobot(), color.setDefault(), arms.setBionic(), body.addArms(), body.addLegs());
    }

    public String deleteRobot() {
        return String.join("; ", body.deleteArms(), body.deleteLegs(), body.deleteRobot());
    }
}
