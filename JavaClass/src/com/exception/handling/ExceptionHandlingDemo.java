package com.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		validate(age);
		
		
		try {
			int num = Integer.parseInt("abc");
			String name = null;
			name.length();
			int[]arr = new int[5];  //length -- 0-4
			arr[5] = 10;   
			int a = 20/0;
		}
		catch(Exception e)  {
		}
		finally {
			
			System.out.println(" After exception in the finally block");
		}
		
}

	public static void validate(int age) {
		// TODO Auto-generated method stub
		if(age < 18)  {
			throw new ArithmeticException("not valid");
		}
		
	}

}

