package Map;
import java.util.HashMap;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<String,Integer>Sweet= new HashMap<>();
	
	
	Sweet.put("Donat", 0);
	Sweet.put("Cake", 2);
	Sweet.put("Candy", 3 );
		
		System.out.println("Sweet number:" + Sweet.get("Sweet "));
				Sweet.remove("cake");
				System.out.println("map size after removal:" + Sweet.size());	
				
	}

}
