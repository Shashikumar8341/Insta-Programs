package com.src.prototypedesignpattern;

// Main.java
//Example: Prototype Design Pattern
//Imagine we have a Shape class(with subclasses like Circle and Rectangle)and we want to create multiple copies of shapes quickly without going through a complex creation process each time.We will use the Prototype pattern to clone these objects.
public class Main {
	//In the Main class, the cloned shapes are created quickly by calling the getShape method and invoking the draw() method.
	public static void main(String[] args) {
		// Load shapes into cache
		ShapeCache.loadCache();

		// Get clones of shapes
		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape1.getType());
		clonedShape1.draw(); // Output: Drawing a Circle

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());
		clonedShape2.draw(); // Output: Drawing a Rectangle
	}
}
