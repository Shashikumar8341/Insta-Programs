package Exmples;

import java.util.Scanner;

public class Division_Of_numbers {
	//Division of two numbers without using division operator
	int a=20;
	int b=25;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//dividend
		int b=sc.nextInt();//divisor
		int quotient=0;
		while(a>=b) {
			a=a-b;
			quotient++;
		}
		System.out.println("quotient is :"+quotient+"\nremainder is :"+a);	}
}
