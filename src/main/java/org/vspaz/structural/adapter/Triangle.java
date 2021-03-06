package org.vspaz.structural.adapter;

public class Triangle {
  private double base;
  private double height;

  public Triangle(int base, int height) {
    setBase(base);
    setHeight(height);
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
