package com.src.designpatterns;

//Lazy Initialization (Thread-Safe Singleton)
//In a multi threaded application, lazy initialization can lead to multiple instances if not handled correctly.
// Here's a thread-safe version using synchronized and double-checked locking:
public class Singleton {
	// Private static variable to hold the instance
	private static volatile Singleton instance = null;

	// Private constructor to prevent instantiation
	private Singleton() {
	}

	// Public static method to provide the instance with lazy initialization and
	// thread safety
	public static Singleton getInstance() {
		if (instance == null) { // First check without locking (improves performance)
			synchronized (Singleton.class) { // Lock on the class object
				if (instance == null) { // Double-check inside the synchronized block
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Thread-safe Singleton Instance");
	}
}
