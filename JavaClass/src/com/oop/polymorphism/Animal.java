package com.oop.polymorphism;

// Parent class
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
}

// Child class that overrides the displayInfo() method
class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

// Another child class demonstrating use of `super`
class SuperDog extends Animal {
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the superclass's displayInfo() method
        System.out.println("I am a dog.");
    }
}



            
        
        

        
