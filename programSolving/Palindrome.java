package com.src.programSolving;

public class Palindrome {

	// check for Palindrome
	public static void main(String[] args) {
		String str = "madam";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(str.equals(reverse));
	}
}
