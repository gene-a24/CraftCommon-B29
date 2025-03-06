package chapter1;

import java.util.Scanner;

public class FirstJavaCode {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = info.next();
		
		
		System.out.println("Enter your age:");
		int age = info.nextInt();
		
		
		System.out.println("Enter your Salary");
		Double salary = info.nextDouble();
		
		System.out.println("Enter your bouns");
		Double bouns = info.nextDouble();
		
		Double totalSalary = salary + bouns;
		
		
		
		
		System.out.println("Person name:"+name);
		System.out.println("Person age;"+age);
		System.out.println("Person salary:'"+salary);
		System.out.println("Person bouns:"+bouns);
		System.out.println("Person totalSalary:"+totalSalary);
		
		
		// System.out.println("Hello class this is my first jave code");
		
		/*String name = "Selam";
		int age = 230;
		double Salary = 2000.050;
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("Salary:"+Salary);
		
		System.out.println("cat meow"); */
		
		// that is output 
		
		//for input we will be using scanner what that means I don't know yet side note 
		
		
		
		
		
	}

}
