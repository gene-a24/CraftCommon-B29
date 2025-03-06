package chater5;

public class ArrayStudentMarkdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studentMarks = {91,88,99,95,97,89,91};
		
		double average;
		double sum = 0;
		
		for(double element: studentMarks) {
			sum = sum + element;
		}
		
		average = sum/ studentMarks.length;
		
		System.out.println("Average marks:"+average);

	}

}
