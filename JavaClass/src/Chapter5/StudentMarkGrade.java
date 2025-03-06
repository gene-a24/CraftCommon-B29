package Chapter5;
 this is student grade list
public class StudentMarkGrade {

	public static void main(String[] args) {
		// Array of student names
		String[] Students = {"James", "John", "Mary"};
		// 2D array of marks where each row corresponds to a student
		//and each column  corresponds to a subject mark.
		int[][] marks =  {
				{85, 78, 92},   // Marks for James
				{76, 88, 90},   // Marks for John
				{91,92,93},     // Marks for Mary
				
		};
		
		//Iterate for each student (each row)
		
		for(int i = 0; i < marks.length; i++)  {
		  int sum = 0; 

			System.out.print(Students[i] + "marks:");
			
			// Iterate over each subject mark for  the student
			for(int j= 0; j < marks[i].length; j++)  {
				System.out.print(marks[i][j] +  " ");
				sum += marks[i] [j];
			}
			
			// calculate the average mark for the student
			double average = (double) sum / marks[i].length;
			
			// Determine letter grade based on average 
			String grade;
			if(average >= 90)  {
				grade = "A";
			
			}else if(average >= 80)  {
					grade = "B";
			} else if(average >= 70)  {
				 grade = "C";
			}else if(average >= 60)  {
				 grade = "D";
			}else {
				 grade = "F";
			}
			System.out.println(" | Average: " + average + " | Grade: " + grade);
				
			}
		}
		
	}

	


