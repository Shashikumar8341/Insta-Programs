package com.src.programSolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class Non_Repeatedin_string {
	public static void main(String[] args) {
		String string = "lavanya";
		Map<Character, Integer> charcount = new LinkedHashMap<>();
		for (char c : string.toCharArray()) {
			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
