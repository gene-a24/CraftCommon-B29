package com.oop.polymorphism;

public class MathOperations {
	// Example Method overloading in java

	// Method with two integer parameters
	
	public int add(int a, int b)  {
		return a + b;
		}
	// Overloaded method with three integer parameters
	
	public int add(int a, int b, int c)  {
		return a + b + c;
	}
  
	// Overloaded method with double  parameters		
			
	public double add(double a, double b)  {
				return a + b;
	}
	// Overloaded method with different parameter order		
				
	public String add(String a, int b)  {
			return a + b; // concatenation
	
	}
}
	
	
	
