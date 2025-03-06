package labClass;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("Sammy", 24);
		ages.put("sara", 22);
		ages.put("Santa", 200);
		
		System.out.println("Age of Sammy:" + ages.get("Sammy"));
		
		ages.remove("Santa");
		
		System.out.println("Map size after removal:"+ ages.size());
		
		System.out.println("key point Sara:" + ages.containsKey("sara"));
		
		System.out.println("value of Sara:" + ages.get("sara"));

	}

}
