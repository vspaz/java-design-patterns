package org.vspaz.creational.builder;

import java.net.http.WebSocket;

public class Car implements IBuilder {
    private String brandName;
    private Product product = new Product();

    public Car(String brandName) {
        this.brandName = brandName;
        product.add(String.format("Car model is :%s", this.brandName));

    }

    @Override
    public void Body(String bodyType) {
        product.add(bodyType);
    }

    @Override
    public void Wheels(int wheelCount) {
        product.add(String.format("%d wheels added", wheelCount));
    }

    @Override
    public void Headlights(String headlightsType) {
        product.add(headlightsType);
    }

    @Override
    public String Build() {
        return product.getProduct();
    }
}
