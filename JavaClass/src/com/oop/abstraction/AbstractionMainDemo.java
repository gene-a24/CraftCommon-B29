package com.oop.abstraction;

// Main Class
public class AbstractionMainDemo {
    public static void main(String[] args) {
        // Creating objects using polymorphism
        MotorBike b1 = new SportBike();
        b1.brake(); // Calls SportBike's brake method

        MotorBike m1 = new MountainBike();
        m1.brake(); // Calls MountainBike's brake method
    }
}

	

