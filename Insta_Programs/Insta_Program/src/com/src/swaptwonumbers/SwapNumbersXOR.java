package com.src.swaptwonumbers;
public class SwapNumbersXOR {

    public static void main(String[] args) {
        int a = 15;  // First number
        int b = 25;  // Second number

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using XOR
        a = a ^ b; // a now holds the XOR of a and b
        b = a ^ b; // b now holds the original value of a
        a = a ^ b; // a now holds the original value of b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
