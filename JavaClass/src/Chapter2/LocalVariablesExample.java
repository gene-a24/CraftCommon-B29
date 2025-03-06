package Chapter2;

public class LocalVariablesExample {

	public static void main(String[] args) {
		
		int result = sum(5, 10);
		System.out.println("Sum: " + result);
		}
	public static int sum(int a, int b)  {
		 return a + b; // and and b are local variables
	}

}
