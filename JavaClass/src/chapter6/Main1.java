package chapter6;

 import java.util.Scanner;
 import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of integers: ");
        int size = scanner.nextInt();
        
        int[] numbers = getIntegers(size);
        
        System.out.println("Original array:");
        printArray(numbers);
        
        int[] sortedNumbers = sortIntegers(numbers);
        
        System.out.println("Sorted array in descending order:");
        printArray(sortedNumbers);
        
        scanner.close();
    }

    // Reads integers from the keyboard
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Prints the contents of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Sorts the array in descending order and returns a new sorted array
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        // Reverse the sorted array to make it descending
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        
        return sortedArray;
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

        
