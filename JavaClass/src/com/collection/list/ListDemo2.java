package com.collection.list;
  import java.util.*;
public class ListDemo2 {

	public static void main(String[] args) {
		
		List numbers = new LinkedList<>();
		
		
		// Add elements to the list
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("List:"  + numbers);
		
		
		// Access elements from the list 
		
		int number = (int) numbers.get(2);
		
		System.out.println("Accessed Element:"  + number); //3
		
		// using the indexOf() method
		
		int index = numbers.indexOf(2);
		System.out.println("Possition of 3 is "  + index);
		
	// Remove element from the list
		
		Object removednumbers = numbers.remove(1);
		
		System.out.println("Removed Element:"  + removednumbers);
		
		
		
		
		
		
		

	}

}
