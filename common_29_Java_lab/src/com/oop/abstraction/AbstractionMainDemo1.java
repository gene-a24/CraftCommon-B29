package com.oop.abstraction;

public class AbstractionMainDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AbstractionMainDemo1 l1 = new AbstractionMainDemo1();
//		
//		l1.display();
		
//		MotorBike b1 = new SportsBike();
//		b1.brake();
//		
//		MotorBike m1 = new MountainBike();
//		m1.brake();
		
		Figure f1 = new Rectangle(10, 20);
		
		double returnVal = f1.area();
		
		System.out.println(returnVal);

	}

}
