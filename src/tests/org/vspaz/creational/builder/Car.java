package org.vspaz.creational.builder;


public class Car implements IBuilder {
    private final Product product = new Product();

    public Car(String brandName) {
        product.add(String.format("Car model is :%s", brandName));

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
