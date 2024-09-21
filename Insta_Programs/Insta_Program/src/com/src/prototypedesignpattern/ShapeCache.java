package com.src.prototypedesignpattern;

// ShapeCache.java
import java.util.Hashtable;

//The ShapeCache class stores the original objects in a cache (like a registry), and when the client requests a shape, it returns a clone of the original object instead of creating a new one.
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	// Get the shape from the cache and clone it
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// Load shapes into the cache (e.g., from a database or initialization)
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
