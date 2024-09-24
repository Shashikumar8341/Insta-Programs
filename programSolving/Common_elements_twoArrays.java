package com.src.programSolving;

import java.util.HashSet;

public class Common_elements_twoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			if (set.contains(num)) {
				System.out.println(num + "");
			}
		}
	}
}