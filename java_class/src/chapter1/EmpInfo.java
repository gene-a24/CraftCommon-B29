package chapter1;
import java.util.Scanner;
public class EmpInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter Firstname");
		String Firstname =userInput.next();
		
		System.out.println("Enter Lastname");
		String Lastname =userInput.next();
		
		System.out.println("Enter Your Age");
		int age = userInput.nextInt();
		
		System.out.println("Enter Your Message");
		String Message = userInput.next();
	}

		
		// System.out.println("My Name Is: " + Lastname+", " + Firstname +  Lastname);
		//System.out.println("Age: " + age);
		//System.out.println("Salary:" + salary);
		
	}


