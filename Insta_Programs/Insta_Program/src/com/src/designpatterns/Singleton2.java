package com.src.designpatterns;

//Example: Singleton Design Pattern (Creational)
//The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
public class Singleton2 {
	// Private static instance of the same class (eager initialization)
	private static Singleton2 instance = new Singleton2();

	// Private constructor to restrict instantiation from outside the class
	private Singleton2() {
	}

	// Public method to provide global access to the instance
	public static Singleton2 getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello, I am a Singleton!");
	}
}
