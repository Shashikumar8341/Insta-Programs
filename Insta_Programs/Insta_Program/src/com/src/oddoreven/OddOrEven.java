package com.src.oddoreven;
public class OddOrEven {
    
    // Method to check if a number is even or odd
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 7; // You can change this number to test other values
        
        // Count method calls
        int methodCallCount = 0;
        
        // Check if the number is even or odd
        System.out.println("Number " + number + " is " + checkOddEven(number));
        
        // Increment method call count
        methodCallCount++;
        
        // Print the number of method calls
        System.out.println("Number of method calls: " + methodCallCount);
    }
}
