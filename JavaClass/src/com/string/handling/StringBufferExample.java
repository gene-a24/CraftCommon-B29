package com.string.handling;

import java.io.IOException;

public class StringBufferExample {  // Renamed class to avoid conflict

    public static void main(String[] args) throws Exception {
        
        // Correct usage of StringBuffer
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        
        ((Appendable) sb).append("Hello");
        System.out.println(sb);

        // Array Exception Handling
        int a[] = new int[2];  // Array of size 2 (indices 0 and 1)

        try {
            System.out.println("Access element three: " + a[3]); // Will cause an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}