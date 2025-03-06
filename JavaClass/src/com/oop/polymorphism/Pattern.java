package com.oop.polymorphism;

public class Pattern {

    public static void main(String[] args) {
        Pattern p1 = new Pattern();
        
        // Calling overloaded methods
        p1.display();   // Default pattern
        System.out.println();
        p1.display("G"); // Pattern for a specific character
    }

    // Method without parameters (default pattern)
    private void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Printing a basic triangle pattern
            }
            System.out.println();
        }
    }

    // Overloaded method with a parameter
    private void display(String character) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");  // Printing pattern with custom character
            }
            System.out.println();
        }
    }
}
