package com.src.programSolving;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter second number");
		double num2 = scanner.nextDouble();
		System.out.println("Enter operation (+,-,*,/):");
		char opreation = scanner.next().charAt(0);
		int result;
		switch (opreation) {
		case '+':
			result = (int) (num1 + num2);
			break;
		case '-':
			result = (int) (num1 - num2);
			break;
		case '*':
			result = (int) (num1 * num2);
			break;
		case '/':
			result = (int) (num1 / num2);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opreation);
		}
		System.out.println("Result:" + result);
	}
}
