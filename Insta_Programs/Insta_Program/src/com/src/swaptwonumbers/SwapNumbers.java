package com.src.swaptwonumbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first  number");
		int a = 5;

		System.out.println("Enter the second  number");
		int b = 10;
		System.out.println("Before the swaping :A=" + a + " b=" + b);
		a = a + b;
		a = a - b;
		b = a - b;
		System.out.println("After the swaping :A=" + a + " b=" + b);
	}

}
