package com.map;
 import java.util.*;
public class MapInterfaceDemo1 {

	private static Set set;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(100, "Abdul Hanif");
		hm.put(200, "Smitha Ganesh");
		
		hm.put(300, "Mohammed Gani");
		hm.put(400, "Robbert Green");
		 
		System.out.print(hm.get(400));
		
		
		// iterating through the map data
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())  {
			Map.Entry mp = (Map.Entry) itr.next();
			
			System.out.println(mp.getKey() + " , ");
			System.out.println(mp.getValue());
		}
		
		
		
		
		}

}
