package com.pojo;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        list.clear();  // Removes all elements

        System.out.println("After clear: " + list); // Output: []
    }



	}


