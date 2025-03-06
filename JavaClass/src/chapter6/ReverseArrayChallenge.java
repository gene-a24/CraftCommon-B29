package chapter6;

import java.util.Scanner;
import java.util.Arrays;


public class ReverseArrayChallenge {

	public static void main(String[] args)  {
	

		Scanner scanner = new Scanner(System.in);
		
		// Ask user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        // Read elements into the array
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Reverse the array
        reverse(numbers);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        scanner.close();
    }

    // Method to reverse the array in place
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indexes
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the center
            left++;
            right--;
     }
        }

    		
    	}
		
		
		

