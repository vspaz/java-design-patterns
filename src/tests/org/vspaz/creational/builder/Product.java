package org.vspaz.creational.builder;

import java.util.LinkedList;

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
