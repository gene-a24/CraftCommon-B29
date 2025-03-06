package com.oop.polymorphism;


 //Main class
public class MethodOverridingExample {
 public static void main(String[] args) {
     Animal myAnimal = new Animal(); // Create an Animal object
     Animal myDog = new Dog();       // Create a Dog object (polymorphism)

     myAnimal.makeSound(); // Outputs: The animal makes a sound
     myDog.makeSound();    // Outputs: The dog barks
 }
}






















