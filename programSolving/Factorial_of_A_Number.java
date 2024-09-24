package com.src.programSolving;

public class Factorial_of_A_Number {

	public static void main(String[] args) {
		int num = 5, factotial = 1;
		for (int i = 1; i <= num; i++) {
			factotial *= i;
		}
		System.out.println(factotial);
	}
}