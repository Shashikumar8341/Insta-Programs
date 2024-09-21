package com.src.factorydesignpattern;

// CarFactory.java
public class CarFactory {

	// Factory method that returns the appropriate car type
	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("SEDAN")) {
			return new Sedan();
		} else if (carType.equalsIgnoreCase("SUV")) {
			return new SUV();
		} else if (carType.equalsIgnoreCase("HATCHBACK")) {
			return new Hatchback();
		}
		return null;
	}
}
