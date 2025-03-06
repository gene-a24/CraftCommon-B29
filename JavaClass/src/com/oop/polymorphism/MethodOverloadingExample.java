package com.oop.polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
      // calling different overload methods
		System.out.println("Sum of 2 and 3: " + obj.add(2, 3));
		System.out.println("Sum of 2, 3, and 4: " + obj.add(2, 3, 4));
		System.out.println("Sum of 2.5 and 3.5 : " + obj.add(2.5, 3.5));
		System.out.println("SConcatenation: " + obj.add("Number: ", 10));
	}
	

}
