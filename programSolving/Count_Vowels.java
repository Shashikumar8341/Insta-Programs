package com.src.programSolving;

public class Count_Vowels {

	// Count_Vowels and Consonants

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Automation";
		int vowels = 0, consonants = 0;
		for (char c : str.toCharArray()) {
			if ("shashi".indexOf(c) != -1) {
				vowels++;
			} else if (Character.isLetter(c)) {
				consonants++;
			}
		}
		System.out.println("Vowels=" + vowels + ", Consonants=" + consonants);
	}
}
