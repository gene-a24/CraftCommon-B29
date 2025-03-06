package com.oop.abstraction;

public class Rectangle extends Figure {

	
	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double result = dim1 * dim2;
		return result;
	}

}
