package org.vspaz.structural.facade.robot;

public class Body {
    public String createRobot() {
        return String.format("'%s' robot is created", Body.class.getName());
    }

    public String addArms() {
        return "arms added";
    }

    public String addLegs() {
        return "legs added";
    }

    public String deleteRobot() {
        return String.format("'%s' robot is deleted", Body.class.getName());
    }

    public String deleteArms() {
        return "arms deleted";
    }

    public String deleteLegs() {
        return "legs deleted";
    }
}
