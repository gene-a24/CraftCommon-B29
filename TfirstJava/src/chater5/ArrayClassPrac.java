package chater5;

import java.util.Arrays;

public class ArrayClassPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Zoom_StudenName[] = { "Hilina", "Eden", "Mati", "Biniam", "Sofiya", "Fuad", "Emebat", "Danny", "Selam" };
		
		System.out.println(Zoom_StudenName[4]);
		
		System.out.println("Orginal list of student names:");
		for(String name : Zoom_StudenName) {
			System.out.println(name);
		}
		
		Arrays.sort(Zoom_StudenName);
		
		System.out.println("Sorted by alphabet list of student names:");
		for(String name : Zoom_StudenName) {
			System.out.println(name);
		}
	}

}
