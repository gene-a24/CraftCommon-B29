package com.oop.polymorphism;

public class Dog extends Animal{
	
	@Override
	public void eat() {
		System.out.println("I eat dog food");
	}
	
    // new method in subclass 
    public void bark() {
      System.out.println("I can bark");
    }

}
