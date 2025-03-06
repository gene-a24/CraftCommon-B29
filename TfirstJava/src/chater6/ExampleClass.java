package chater6;

public class ExampleClass {
	
	int num1 = 50;
	int num2 = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleClass itsObject = new ExampleClass();
		
		int x = itsObject.num1;
		int y = itsObject.num2;
		itsObject.sub();
		
		System.out.println(x);
		System.out.println(y);
		
			
	}
 
	void add() {
		System.out.println("This is add method");
	}
	
	void sub() {
		System.out.println("This is sub method");
	}
}
