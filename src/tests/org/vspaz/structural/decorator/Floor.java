package org.vspaz.structural.decorator;

public class Floor extends BaseDecorator {
    @Override
    public String buildHouse() {
        return super.buildHouse() + addFloor();
    }

    private String addFloor() {
        return "floor added";
    }
}
