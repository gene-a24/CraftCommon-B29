package chapter6;

public class SubMethod {
	// method to subtract two integers
	public int subtract(int a, int b)  {
		return a - b;
	}

	public static void main(String[] args) {
		//create an instance of the SubMethod class
		
		SubMethod method = new SubMethod();
		
		//call the subtract method with different pairs of numbers
		int result1 = method.subtract(10, 5);
		int result2 = method.subtract(200, 40);
		
		// display the results
		System.out.println("10-5 =" + result1);
		
		System.out.println("200-40 =" + result2);

	}

}
