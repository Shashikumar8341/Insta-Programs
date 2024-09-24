package com.src.programSolving;

public class Occurrences_of_string {
	public static void main(String[] args) {
		String string = "automation";
		char c = 'a';
		int count = 0;
		for (char ch : string.toCharArray()) {
			if (ch == c)
				count++;
		}
		System.out.println(count);
	}
}
