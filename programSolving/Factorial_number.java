package com.src.programSolving;

public class Factorial_number {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(num);
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
