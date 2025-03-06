package com.map;

import java.util.*;

public class MapInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(100,"Abdul Hanif");
		hm.put(200,"Mohammed Gani");
		hm.put(300,"Smitha Ganesh");
		hm.put(400,"Robert Green");
		
		
		// itrating through the map data
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry mp = (Map.Entry) itr.next();	
			
			System.out.print(mp.getKey() + " : ");
			System.out.println(mp.getValue());
			
		}


	}

}
