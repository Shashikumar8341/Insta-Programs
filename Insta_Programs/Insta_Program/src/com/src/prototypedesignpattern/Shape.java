package com.src.prototypedesignpattern;

// Shape.java
//The Shape class implements the Cloneable interface and overrides the clone() method to enable cloning.
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void draw();

	// Clone method (shallow copy)
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
