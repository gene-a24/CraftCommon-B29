package collection.List;

import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		// Creating list using the ArrayList class
		
		List nums = new ArrayList<>();
		nums.add("Test1");
		nums.add("1");
		nums.add("100");
		nums.add("2.3");    
		
		//traverse using for loop or iterator
		
		Iterator it = nums.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
        
	}

}
