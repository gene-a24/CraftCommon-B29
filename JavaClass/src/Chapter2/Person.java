package Chapter2;

public class Person {
	String name = "CRAFT"; // Instance variable
	int age = 10; // Instance variable

	public void display()  {
		System.out.println("NAME:" + name +", Age: " + age);
		}
	
	public static void  main(String[] args) {
		Person person = new Person ();
		person.display();
	}

}
