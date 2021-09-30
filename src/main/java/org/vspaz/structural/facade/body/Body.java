package org.vspaz.structural.facade.body;

public class Body {
    public String createRobot() {
        return String.format("%s robot is created", Body.class.getName());
    }

    public String addArms() {
        return "arms added";
    }

    public String addLegs() {
        return "legs added";
    }

    public String deleteRobot() {
        return String.format("%s robot is deleted", Body.class.getName());
    }
}
