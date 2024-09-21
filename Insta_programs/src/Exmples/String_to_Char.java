package Exmples;

import java.util.Scanner;

public class String_to_Char {
	public static void main(String[] args) {
		//convert the given String into char array
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(ch[i]);
		}}
}
