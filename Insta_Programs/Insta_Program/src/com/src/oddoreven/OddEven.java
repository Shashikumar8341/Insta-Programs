package com.src.oddoreven;

import java.util.Scanner;

public class OddEven {

	// Method to check if a number is even or odd and count method calls
	public static String checkOddEven(int number, int[] methodCallCount) {
		methodCallCount[0]++; // Increment method call count
		return (number % 2 == 0) ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Array to hold method call count
		int[] methodCallCount = { 0 };

		// Take user input for the number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is even or odd
		String result = checkOddEven(number, methodCallCount);

		// Output the result
		System.out.println("Number " + number + " is " + result);

		// Output the number of method calls
		System.out.println("Number of method calls: " + methodCallCount[0]);
	}
}
