package com.craftjava;

public class LocalVariableDemo {

	public void methodone() {
		
		int s = 528;
		int j =25;
		int result = s + j;
		
		System.out.println("the value of s+j is:"+result);
		System.out.println("value of j:"+j);
		System.out.println("the frequency of s:"+s);

	}

	public void methodtwo() {
		
		int g = 100, k= 333;
		int result = k-g;
		
		System.out.println("value of g:"+g);
		System.out.println("value of k:"+k);
		System.out.println("the vaule of k-g is:"+result);
	}
	public static void main(String[] args) {
		LocalVariableDemo var = new LocalVariableDemo();
		var.methodone();
		var.methodtwo();
		
	}
}
