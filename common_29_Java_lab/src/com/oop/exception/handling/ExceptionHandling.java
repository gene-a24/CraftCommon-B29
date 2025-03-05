package com.oop.exception.handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a[] = new int[2]; //0-1
		
	      try {
	    	  
	          int value = 10/0;
	          
	         System.out.println("Access element three :" + a[3]);
	     
	      }
	      catch (Exception e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	    
	      finally {
	         a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
	      }

		
	}

}
