package com.oop.inheritance;

public class InheritanceMainDemo1 {

	public static void main(String[] args) {

		// create an object of the subclass
		Dog d1 = new Dog();

		// access field of superclass
		d1.name = "Rohu";
		d1.display();
		
		// call method of superclass // using object of subclass
		d1.eat();

	}

}
