package com.src.builderdesignpattern;

// Main.java
//Example: Builder Design Pattern
//Imagine we are building a House object,which has optional features like a pool,garden,and garage.Using the Builder pattern,you can choose which features to include when constructing the house.
public class Main {
	public static void main(String[] args) {
		// Using the builder to create a house with only pool and garage
		House house1 = new House.HouseBuilder("Concrete", "Wood", "Tiles").setPool(true).setGarage(true).build();

		System.out.println(house1);

		// Using the builder to create a house with garden and pool but no garage
		House house2 = new House.HouseBuilder("Concrete", "Brick", "Metal").setGarden(true).setPool(true).build();

		System.out.println(house2);
	}
}
