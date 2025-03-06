package Chapter2;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a =true;
		boolean b = false;
		
		System.out.println("AND oper &&");
		System.out.println(a && b); // false
		System.out.println(b && a); // false
		System.out.println(a && a); // true
		System.out.println(b && b); // false
		
		System.out.println("OR oper ||");
		System.out.println(a || b); // true
		System.out.println(b || a);  // true
		System.out.println(a || a);  // true
		System.out.println(b || b);  // false
		
		System.out.println("Not oper !");
		System.out.println(!a); // false
		System.out.println(!b); // true
		
		
		
		
		
		
		
	}


	}
