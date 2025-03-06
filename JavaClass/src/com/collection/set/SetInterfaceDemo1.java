package com.collection.set;
   import java.util.*;

   public class SetInterfaceDemo1 {

	public static void main(String[] args) {
		
		// Creating a set using the HashSet class
		
		Set set1 = new HashSet<>();
		
		// Add elements to the set1
		set1.add(2);
		set1.add(3);
		
		System.out.println("Set1: " + set1);
		
		// creating another set using the HashSet class
		
		Set set2 = new HashSet<>();
		
		//Add elements
		   set2.add(1);
		   set2.add(2);
		   
		   System.out.println("Set2: "  + set2);
		   
		 // Union of two sets
		   
		   set2.addAll(set1);
		   
		   System.out.println("Union is: "  + set2);
		   
		   Set numbers = new TreeSet<>();
		   
		  // Add elements to the set
		   
		   numbers.add(2);
		   numbers.add(3);
		   numbers.add(1);
		   
		   System.out.println(" Set using TressSet:"  + numbers);
		   
		   // Access elements using iterator()
		   System.out.println(" Accessing elements using iterator():" );
		   
		   Iterator itr =  numbers.iterator();
		   while(itr.hasNext() );
		   {
			   System.out.println(itr.next());
			   System.out.println(" , ");
		   }

	}

}
