package com.src.programSolving;

public class Maximum_Elements {

	 //find  maximum value
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 45, 40, 43, 44 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];

	}
		System.out.println(min);
}}
