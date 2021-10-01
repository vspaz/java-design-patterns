package org.vspaz.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
  static Map<String, IVehicle> carFactory = new HashMap<>();

  public static synchronized IVehicle getCar(String carType) throws Exception {
    IVehicle car = carFactory.get(carType);
    if (car != null) {
      return car;
    }

    switch (carType) {
      case "sedan":
        car = new Sedan();
        break;
      case "suv":
        car = new SUV();
        break;
      case "truck":
        car = new Truck();
        break;
      default:
        throw new Exception(String.format("undefined car type '%s'", carType));
    }
    carFactory.put(carType, car);
    return car;
  }

  public int getCarCount() {
    return carFactory.size();
  }
}
