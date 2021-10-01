package org.vspaz.creational.builder;

public class Product {
  private final StringBuilder parts;

  public Product() {
    parts = new StringBuilder();
  }

  public void add(String part) {
    parts.append(part);
  }

  public String getProduct() {
    return parts.toString();
  }
}
