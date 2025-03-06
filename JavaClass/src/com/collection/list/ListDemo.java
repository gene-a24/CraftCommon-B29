package com.collection.list;
 
 import java.util.*;

 public class ListDemo {

	public static void main(String[] args, int i) {
		// creating list using the ArrayList class
		
		List numbers = new ArrayList<>();
		
		numbers.add("James");
		
		numbers.add(100);
		numbers.add(true);
		numbers.add("Jamie");
		numbers.add(2000.5);
// numbers.add(0, "Daniel");
		numbers.set(0,  "Daniel");
		numbers.remove(2);
		
		System.out.println(numbers);
		
		// traverse: For loop, Iterator
		
		Iterator it = numbers.iterator();
		
		while(it.hasNext())  {
			System.out.println(it.next());
		}
		for(int i1= 0; i1<numbers.size(); i1++);
		    System.out.println(numbers.get(i));
		

	}

}
