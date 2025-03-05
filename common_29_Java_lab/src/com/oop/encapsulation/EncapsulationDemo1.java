package com.oop.encapsulation;

public class EncapsulationDemo1 {
	
	private int age;
	private double salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.err.println("Age cannot be zero or negative value");
		}
		else{
		this.age = age;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//setter and getter  method
	//Setter method  help to assign - values or data indirectly	
	//getter method - help to access the value indirectly 
	
	
	

}
