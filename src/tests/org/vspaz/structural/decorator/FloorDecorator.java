package org.vspaz.structural.decorator;

public class FloorDecorator extends BaseDecorator {
    @Override
    public String buildHouse() {
        return super.buildHouse() + addFloor();
    }

    private String addFloor() {
        return "floor added";
    }
}
