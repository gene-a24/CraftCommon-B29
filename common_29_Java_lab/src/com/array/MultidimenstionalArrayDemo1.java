package com.array;

public class MultidimenstionalArrayDemo1 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };

		// For loop - multi-dimentional array - we used nested loops

		double avg;

		for (int i = 0; i < a.length; i++) {

			int sum = 0;

			for (int j = 0; j < a[i].length; j++) {

				sum = sum + a[i][j];

			}

			avg = sum / a[i].length;
			System.out.println("\n");
			System.out.println("Sum of " + (i + 1) + " row :" + sum);
			System.out.println("Average of " + (i + 1) + " row :" + avg);
		}

	}

}
