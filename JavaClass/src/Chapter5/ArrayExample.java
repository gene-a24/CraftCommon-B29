package Chapter5;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		// using a for loop
		for(int i = 0; i < numbers.length; i++)  {
			System.out.println(numbers[i]);
		}
		// Using an enhanced for loop
		for(int num : numbers)  {
			System.out.println(num);
	}
	

	}

}
