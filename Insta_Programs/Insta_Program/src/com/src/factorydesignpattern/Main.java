package com.src.factorydesignpattern;

// Main.java
public class Main {
	// How the Factory Pattern Works:
	// 1.The CarFactory class encapsulates the logic to decide which type of car to
	// create based on the input (SEDAN, SUV, HATCHBACK).
	// 2.The client (Main class) doesn't directly instantiate Sedan, SUV, or
	// Hatchback. Instead, it calls the factory method (getCar), which returns the
	// appropriate car object.
	// 3.This promotes loose coupling since the client code (Main) is only aware of
	// the Car interface and doesn't need to know about the concrete
	// implementations.
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

		// Get a Sedan and call its drive method
		Car car1 = carFactory.getCar("SEDAN");
		car1.drive(); // Output: "Driving a Sedan"

		// Get an SUV and call its drive method
		Car car2 = carFactory.getCar("SUV");
		car2.drive(); // Output: "Driving an SUV"

		// Get a Hatchback and call its drive method
		Car car3 = carFactory.getCar("HATCHBACK");
		car3.drive(); // Output: "Driving a Hatchback"
	}
}
