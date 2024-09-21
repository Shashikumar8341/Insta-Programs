package com.src.primenumbers;

import java.util.Scanner;

public class PrimeNumber {

	// Method to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false; // If divisible by any number other than 1 and itself, it's not prime
			}
		}
		return true; // Otherwise, it is prime
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is prime and print the result
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
