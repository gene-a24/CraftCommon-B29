package com.pojo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        System.out.println(map); // Output: {1=Banana, 2=Cherry, 3=Apple} (Sorted by key)
        
        
	}

	}


