package chapter10;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> a1 = new TreeSet<String>();
		
		a1.add("Maya");
		a1.add("Beyonce");
		a1.add("Maya");
		a1.add("Joey");
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	
	}

}
