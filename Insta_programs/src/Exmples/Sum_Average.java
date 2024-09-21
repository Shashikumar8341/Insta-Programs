package Exmples;

import java.util.ArrayList;

public class Sum_Average {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	int sum=0;
	int avg;
	for (int i = 0; i < a.size(); i++) {
//		String string = args[i];
//		System.out.println(string);
//		
	 sum += a.get(i);
	    avg = sum / a.size();
	    System.out.println("The Average IS:" + avg);
	}
//	System.out.println(a);
//	System.out.println(a.size());
//	System.out.println(a);
	
}
}
