
	public class Main {
	    public static void main(String[] args) {
	        int[] numbers = getIntegers();
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        int[] sortedNumbers = sortIntegers(numbers);
	        System.out.println("Sorted array (descending order):");
	        printArray(sortedNumbers);
	    }

	    public static int[] getIntegers() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of integers: ");
	        int count = scanner.nextInt();
	        int[] array = new int[count];

	        System.out.println("Enter " + count + " integers:");
	        for (int i = 0; i < count; i++) {
	            array[i] = scanner.nextInt();
	        }

	        return array;
	    }

	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static int[] sortIntegers(int[] array) {
	        int[] sortedArray = Arrays.copyOf(array, array.length);
	        Arrays.sort(sortedArray);
	        
	        // Reverse the array to get descending order
	        for (int i = 0; i < sortedArray.length / 2; i++) {
	            int temp = sortedArray[i];
	            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
	            sortedArray[sortedArray.length - 1 - i] = temp;
	        }
	        
	        return sortedArray;
	    }
	}

	
	
   
	package chapterFive;
	
	import java.util.Arrays;
	import java.util.Scanner;
	public class main{
	    public main(String[] args) {
	        int[] numbers = getIntegers();
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        int[] sortedNumbers = sortIntegers(numbers);
	        System.out.println("Sorted array (descending order):");
	        printArray(sortedNumbers);
	    }

	    public static int[] getIntegers() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of integers: ");
	        int count = scanner.nextInt();
	        int[] array = new int[count];

	        System.out.println("Enter " + count + " integers:");
	        for (int i = 0; i < count; i++) {
	            array[i] = scanner.nextInt();
	        }

	        return array;
	    }

	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static int[] sortIntegers(int[] array) {
	        int[] sortedArray = Arrays.copyOf(array, array.length);
	        Arrays.sort(sortedArray);
	        
	        // Reverse the array to get descending order
	        for (int i = 0; i < sortedArray.length / 2; i++) {
	            int temp = sortedArray[i];
	            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
	            sortedArray[sortedArray.length - 1 - i] = temp;
	        }
	        
	        return sortedArray;
	    }
	}

    	 
     
   