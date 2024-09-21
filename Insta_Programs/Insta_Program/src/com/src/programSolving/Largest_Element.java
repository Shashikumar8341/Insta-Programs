package com.src.programSolving;

public class Largest_Element {

	public static void main(String[] args) {
		int[] arr = { 28, 656, 456, 999, 0000 };
		int largest = arr[0];
		for (int i : arr) {
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println(largest);
	}

}
