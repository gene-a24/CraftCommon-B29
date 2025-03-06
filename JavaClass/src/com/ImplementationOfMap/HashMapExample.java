package com.ImplementationOfMap;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Map<String, Integer> age = new HashMap<>();
		
		age.put("Zeleke", 38);
		
		age.put("Kuri", 32);
		age.put("Gedi", 30);
		age.put("Haset", 25);
		
		
		System.out.println("Age of Zeleke:" + age.get("Zeleke"));
		
		// age.remove("Haset");
		
		System.out.println("Map size after removal:" + age.size());
		
		System.out.println("Key point Haset:" + age.containsKey("Haset"));
		
		
		System.out.println("Value of Haset:" + age.get("Haset"));

	}

}
