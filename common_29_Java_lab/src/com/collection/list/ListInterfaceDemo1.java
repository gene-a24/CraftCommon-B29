package com.collection.list;

import java.util.*;

public class ListInterfaceDemo1 {

	public static void main(String[] args) {
		
		// Creating list using the ArrayList class 
		List numbers = new ArrayList<>(); 
		
		numbers.add("James"); //index=0
		numbers.add(100);
		numbers.add(true);
		numbers.add("Jamie");
		numbers.add(2000.5); //index= 4
//		numbers.add(0, "Daniel");
		numbers.set(0, "Daniel");
		numbers.remove(2);
		
		//traverse:  For loop, iterator
	
		System.out.println("Using iterator:");
		Iterator it = numbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n using iterator:");
		for(int i=0; i<numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}
		
		

	}

}
