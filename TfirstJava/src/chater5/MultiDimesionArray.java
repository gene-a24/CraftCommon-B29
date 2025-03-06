package chater5;

public class MultiDimesionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Student = {"Hanna", "Liya", "Sam", "kenny", "Homeboy"};
		int marks [][] = { {70,89,86,97},
				          {99,92,89,89},
				          {77,89,82,99},
				          {90,89,98,100}, {95,0,0}};
		
		for(int i=0; i<marks.length;i++) {
			
			System.out.print(Student[i]+ "Grade:" + " ");
			//System.out.println("Student1:" +i + " ");
			
		for(int k=0; k<marks[i].length; k++) {
			
		System.out.print(marks[i][k]+ " ");
		}
		System.out.println();
			
		}
		
		
		}
	}


