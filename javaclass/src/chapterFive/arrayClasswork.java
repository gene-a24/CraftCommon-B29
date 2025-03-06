package chapterFive;

import java.util.Arrays;
import java.util.Scanner;
public class arrayClasswork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //   String [] students = { "Hilina","Fitsum","Eden","Selam","Mati","Biniam","zeleke","fuad"};
    	
   // System.out.println(students [0]);
  //  System.out.println(students [1]);
//	System.out.println(students [2]);
//	System.out.println(students [3]);
	//System.out.println(students [4]);[]
//	System.out.println(students [5]);
//	System.out.println(students [6]);
  //  System.out.println(students [7]);
	
///	for (int i = 0; i < students.length ; i++) {
//	 System.out.println(students[i]);
	//}

	////String [] students = {"Hilina","Fitsum","Eden","Selam","Mati","Biniam","zeleke","fuad"};
	// Arrays.sort(students);
	
	// System.out.println(Arrays.toString(students));}
		
	int	[] array_number = {10,5,87,15,100};
//	System.out.println(array_number[0]);
//	System.out.println(array_number[1]);
//	System.out.println(array_number[2]);
//	System.out.println(array_number[3]);
//	System.out.println(array_number[4]);
	
	for (int i=0 ; i< array_number.length; i++) {
	
	
	System.out.println("index " + i + "-> " + array_number[i] );
	
}
 
//	Scanner myScan = new Scanner(System.in);
//	
//	int size = 5;
//	int[] myArray = new int[size];
//	
//	
//	System.out.println("Enter" + size +"integers");
//	for (int i = 0 ;i< size; i++) {
//		System.out.println("element "+ i + ":");
//		myArray[i] =myScan.nextInt();
//		
//		}
//			
//	for (int i=0 ; i< size; i++) {
//		
//		
//	System.out.println("index " + i + "-> " + myArray[i] );
//	
//
//			
	  Scanner myScan = new Scanner(System.in);
      
      int size = 5;
      int[] myArray = new int[size];
      
      System.out.println("Enter " + size + " integers:");
      for (int i = 0; i < size; i++) {
          System.out.print("Element " + i + ": ");
          myArray[i] = myScan.nextInt();
      }

      // Sorting in descending order
      Arrays.sort(myArray); // Sorts in ascending order
      // Reverse the array to get descending order
      for (int i = 0; i < size / 2; i++) {
          int temp = myArray[i];
          myArray[i] = myArray[size - 1 - i];
          myArray[size - 1 - i] = temp;
      }

      System.out.println("\nSorted elements in descending order:");
      for (int i = 0; i < size; i++) {
          System.out.println("Index " + i + " -> " + myArray[i]);
      }
      
      myScan.close(); // Close the Scanner
  }
}
			
	
	
