package com.src.factorydesignpattern;

// Sedan.java
public class Sedan implements Car {
	@Override
	public void drive() {
		System.out.println("Driving a Sedan");
	}
}