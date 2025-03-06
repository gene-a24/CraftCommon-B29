package chater5;

import java.util.Arrays;

public class SingleDimensionlaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ageofStudents = new int [5];
				
				ageofStudents[0] = 23;
				ageofStudents[1] = 21;
				ageofStudents[2] = 33;
				ageofStudents[3] = 31;
			    ageofStudents[4] = 25;
			    
			    for (int i=0; i < ageofStudents.length; i++) {
			    	System.out.print(ageofStudents[i] + "  ");
			    }
			    	//System.out.println(ageofStudents.length);
			    
			   System.out.println("\n");
			    
			    Arrays.sort(ageofStudents);
			    
			    System.out.print("Sorted:");
			   
			    for(int Age : ageofStudents) {
			    	System.out.print(Age + " ");
			    } 
			    
			    }
	}
			  
	


