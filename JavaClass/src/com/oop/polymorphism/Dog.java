package com.oop.polymorphism;

// Cat class overriding makeSound
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

