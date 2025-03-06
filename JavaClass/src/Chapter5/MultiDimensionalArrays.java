package Chapter5;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// Declare and initialize a 2D  array (matrix)
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		// Iterate over the 2D array using nested for loop
		for(int i = 0; i < matrix.length; i++)  {           // loop throw each row
			for(int j = 0; j < matrix[i].length; j++)  {   //loop through each element in the row
				
				System.out.print(matrix[i][j] + "");      //print element with a space
			}
			System.out.println();                       // Move to the next line after each row
			
		}

	}

}
