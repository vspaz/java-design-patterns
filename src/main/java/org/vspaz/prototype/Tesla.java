package org.vspaz.prototype;

public class Tesla extends CarBase {
    public int basePrice = 100_000;
    public Tesla(String model) {
        modelName = model;
    }

    @Override
    public CarBase clone() throws CloneNotSupportedException {
        return (Tesla)super.clone();
    }
}
