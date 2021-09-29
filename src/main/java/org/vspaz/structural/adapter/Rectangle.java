package org.vspaz.structural.adapter;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
