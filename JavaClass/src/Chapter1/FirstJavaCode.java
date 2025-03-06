package Chapter1;
import java.util.Scanner;

public class FirstJavaCode {

	public static void main(String[] args) {
		
  Scanner userInput = new Scanner(System.in);
  System.out.print("Enter Name");
  String name = userInput.next();
  System.out.print("Enter Your Age");
  int age = userInput.nextInt();
  System.out.print("Enter Your Message");
  String message =userInput.next();
  
  System.out.print(name);
  System.out.print(age);
  System.out.print(message);

  
 System.out.println("My Name is Zeleke");
System.out.println("Java Student at Craft");
System.out .println(2025);

		
	}

}
