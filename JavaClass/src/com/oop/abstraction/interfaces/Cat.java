package com.oop.abstraction.interfaces;

//Defining an interface named Cat
interface Cat {
 void eat();    // Abstract method (to be implemented)
 void travel(); // Another abstract method
}

//Implementing the interface in the Mammal class
class Mammal implements Cat {
 @Override
 public void eat() {
     System.out.println("Mammal is eating");
 }

 @Override
 public void travel() {
     System.out.println("Mammal is traveling");
 }


//Main class to test the implementation
//public class Main {
 public static void main(String[] args) {
     Cat mammal = new Mammal();
     mammal.eat();    // Calls implemented eat() method
     mammal.travel(); // Calls implemented travel() method
 }
}


