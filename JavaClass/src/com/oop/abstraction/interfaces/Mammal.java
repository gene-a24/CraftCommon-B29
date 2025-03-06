
package com.oop.abstraction.interfaces;


public class Mammal implements Cat {

    @Override
    public void eat() {
        System.out.println("Mammal can eat");
    }

    @Override
    public void travel() {
        System.out.println("Mammal can travel");
    }
    
    
}








