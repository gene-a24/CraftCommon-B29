package com.string.handling;

public class StringHandling {

	public static void main(String[] args) {
		
		String str1 = "Ronaldo";
		
//		str1.concat(" and ").concat("Messi");
//		
//		System.out.println("Man of the Match is: "+  str1); //Man of the Match is: Ronaldo  and Messi
//		
//		System.out.println("Concat works: "+  str1.concat(" and ").concat("Messi"));
//		
//		String str2 = "I" + " Like" + " Java" + " Language";
//		
//		System.out.println(str2);
//		
//		int len = str2.length();
//		
//		System.out.println(len);
		
//		String str3 = "This is Hanif";
//		
//		char ch1 = str3.charAt(3);//s
//		
//		System.out.println(ch1);
		
//		String str4 = "Ismail";
//		String str5 = "iSmael";
//		
////		if(str4.equals(str5)) {
////			System.out.println("They are equal");
////		}
////		else {
////			System.out.println("They are not equal");
////		}
//		
//		if(str4.equalsIgnoreCase(str5)) {
//			System.out.println("They are equal");
//		}
//		else {
//			System.out.println("They are not equal");
//		}
		
//		String str6 = "23456765Y4567";
//		char ch;
//		
//		for(int i=0; i<str6.length(); i++) {
//			
//			ch = str6.charAt(i);
//			
//			System.out.println(ch);
//			
//			if(Character.isDigit(ch)) {
//				continue;
//			}
//			else {
//				System.out.println("The String non Digits");
//			}
//		}
		
//		String str7 = "Today is holiday. Tomorrow is woking day.";
//		
//		System.out.println(str7.indexOf("holiday"));
//		
//		System.out.println(str7.substring(9, 16));
//		
//		System.out.println(str7.toLowerCase());
//		
//		System.out.println(str7.toUpperCase());
//		
//		System.out.println(str7.trim());
//		
//		String arr[] = str7.split(" ");
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("index " + i + " :" +arr[i]);
//		}
		
		
		//String Buffer
		StringBuffer str8 = new StringBuffer("Hello");
		str8.insert(5, " World");
		
		System.out.println(str8);
		
		

	}

}
