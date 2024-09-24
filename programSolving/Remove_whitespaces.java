package com.src.programSolving;

public class Remove_whitespaces {
	public static void main(String[] args) {
		String string = "s ha shi k umar";
		String result = string.replaceAll("\\s+", "");
		String result2 = string.replaceAll(string, result);
		System.out.println(result);
		System.out.println(result2);
	}
}