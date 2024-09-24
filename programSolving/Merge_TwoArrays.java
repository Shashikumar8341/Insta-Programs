package com.src.programSolving;

import java.util.Arrays;

public class Merge_TwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] merged = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		System.out.println(Arrays.toString(merged));
	}
}
