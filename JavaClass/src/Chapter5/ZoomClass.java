package Chapter5;

import java.util.Arrays;

public class ZoomClass {

	public static void main(String[] args) {
		
		// step 1: Declare and initialize the array with student names
		
		String[] studentnames = { "Mati",  "Binyam",  "Fuad", 
				      "Hilina", "Selam", "Daniel","Zeleke",  "Yordanos"};
		
		// step 2: print each name using an enhanced for loop
		
		System.out.println("Original list of student names:");
		for(String name : studentnames) {
			System.out.println(name); 
		}
			
		//step 3 Sort the array by alphabetically
			 Arrays.sort(studentnames); 
			
			//print the sorted list of names
			System.out.println("nsorted list of student names:");
			for(String name : studentnames)  {
				System.out.println(name);
			
			
			
		}

	}

}
