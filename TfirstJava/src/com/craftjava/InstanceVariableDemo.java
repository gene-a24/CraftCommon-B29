package com.craftjava;

public class InstanceVariableDemo {
	
	int age = 23; // this is instance variable which is inside class but outside of the method
	
	public void methodone() {
		
		int R = 15; // this is the local variable inside method 
		
		System.out.print("value of R:"+R);
		System.out.print("value of age:"+age); // instance variable is accessible to all methods 
		
	}

	public void methodtwo() {
		
		int E = 22;
		
		System.out.println("value of E:"+E);
		System.out.println("value of age:"+age); // instance variable being used again in different method 
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariableDemo var1 = new InstanceVariableDemo();
		InstanceVariableDemo var2 = new InstanceVariableDemo();
		var1.methodone();
		var1.methodtwo();
		
		var2.methodone();
		var2.methodtwo();
		
		

	}

}
