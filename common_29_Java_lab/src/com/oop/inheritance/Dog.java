package com.oop.inheritance;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}

    // new method in subclass 
    public void display() {
      System.out.println("My name is " + name);
    }
	
}
