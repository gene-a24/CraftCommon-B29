package chapter6;

import java.util.Scanner;

public class MinElementChallenge {
	
       // Static Scanner for user input
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        // Ask user for the number of integer
	        System.out.print("Enter the number of integers: ");
	        int count = scanner.nextInt();

	        // Read integers into an array
	        int[] numbers = readIntegers(count);

	        // Find and print the minimum value
	        int minValue = findMin(numbers);
	        System.out.println("The minimum value in the array is: " + minValue);
	    }

	    // Method to read integers from the console
	    public static int[] readIntegers(int count) {
	        int[] array = new int[count];
	        System.out.println("Enter " + count + " integers:");
	        
	        for (int i = 0; i < count; i++) {
	            array[i] = scanner.nextInt();
	        }
	        return array;
	    }

	    // Method to find the minimum value in the array
	    public static int findMin(int[] array) {
	        int min = array[0]; // Assume the first element is the smallest

	        for (int num : array) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        return min;
	    }
	}
	
	
