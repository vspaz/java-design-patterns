package org.vspaz.creational.builder;


public class Car implements IBuilder {
    private final Product product = new Product();

    public Car(String brandName) {
        product.add(String.format("Car model is '%s'", brandName));

    }

    @Override
    public void Body(String bodyType) {
        product.add(String.format(", chassis '%s'", bodyType));
    }

    @Override
    public void Wheels(int wheelCount) {
        product.add(String.format(", 'has '%d' wheels", wheelCount));
    }

    @Override
    public void Headlights(String headlightsType) {
        product.add(String.format(", headlights type is '%s'", headlightsType));
    }

    @Override
    public String Build() {
        product.add(".");
        return product.getProduct();
    }
}
