package com.src.oddoreven;

import java.util.Scanner;

public class OddEvenChecker {

	// Method to check if a number is even or odd using recursion
	public String checkOddEven(int number, int[] methodCallCount) {
		methodCallCount[0]++; // Increment method call count

		// Base case for recursive method
		if (number == 0) {
			return "Even";
		} else if (number == 1) {
			return "Odd";
		} else {
			// Recursively reduce the number by 2
			return checkOddEven(number - 2, methodCallCount);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Array to hold method call count
		int[] methodCallCount = { 0 };

		// Take user input for the number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Create an object of OddEvenChecker
		OddEvenChecker checker = new OddEvenChecker();

		// Check if the number is even or odd
		String result = checker.checkOddEven(number, methodCallCount);

		// Output the result
		System.out.println("Number " + number + " is " + result);

		// Output the number of method calls
		System.out.println("Number of method calls: " + methodCallCount[0]);
	}
}
