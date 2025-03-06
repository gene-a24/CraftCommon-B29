package Chapter3;

public class GradeEvaluator {

	public static void main(String[] args) {
		//Store a grade
	char grade = 'A';  // Change this value to test different cases
	
	// Use switch statements to evaluate performance
		
		switch (grade)  {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
		    break;
		    
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
			
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
				
		}
		
	}
}

		
		
		



