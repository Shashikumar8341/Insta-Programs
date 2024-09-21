package com.src.prototypedesignpattern;

// Circle.java
public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

// Rectangle.java
