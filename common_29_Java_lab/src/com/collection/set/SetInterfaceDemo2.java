package com.collection.set;

import java.util.*;

public class SetInterfaceDemo2 {

	public static void main(String[] args) {

		// Creating a set using the TreeSet class
		Set numbers = new TreeSet<>();

		// Add elements to the set
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);

		System.out.println("Set using TreeSet: " + numbers);

		// Access Elements using iterator()
		System.out.print("Accessing elements using iterator(): ");

		Iterator itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(", ");

		}

	}

}
