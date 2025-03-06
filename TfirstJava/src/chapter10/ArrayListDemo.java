package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList< String> fruits = new ArrayList<String>();
		
		fruits.add("Strawberry");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Watemelon");
		fruits.add("orange");
		
		System.out.println(fruits);
		
		// for(String element: fruits) {
			// System.out.print(element+ " " ); */
			
			fruits.remove("Apple");
			System.out.print("After Deleting elements: \n" +fruits);
			
			fruits.remove(1);
			System.out.println("After Deleting elements: \n" +fruits);
			
			
			Iterator<String> it = fruits.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
