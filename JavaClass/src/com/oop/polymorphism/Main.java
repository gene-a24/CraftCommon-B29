package com.oop.polymorphism;

public class Main {

	public static void main(String[] args) {
		
           
		 // Example 1: Overriding without using `super`
		        Dog d1 = new Dog();
		        d1.displayInfo();  // Output: I am a dog.

		        // Example 2: Overriding with `super`
		        SuperDog d2 = new SuperDog();
		        d2.displayInfo();  
		    }
		}
		            

