package com.src.designpatterns;

public class Mains {
	public static void main(String[] args) {
		// Get the only object available (Singleton instance)
		Singleton2 singleton = Singleton2.getInstance();

		// Show message
		singleton.showMessage();
	}
}