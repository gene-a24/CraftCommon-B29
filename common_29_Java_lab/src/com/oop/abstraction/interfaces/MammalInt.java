package com.oop.abstraction.interfaces;

public class MammalInt implements Dog{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal can eat");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal can travel");
	}

	@Override
	public void No_of_legs() {
		// TODO Auto-generated method stub
		System.out.println("4 legs");
	}

}
