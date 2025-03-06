package chapter2;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean a = true;
    boolean b  = false;
    System.out.println(a && b);
    System.out.println(b && a);
	System.out.println(a && a);
	System.out.println(b && b);
	
	
	System.out.println(a || b);
	System.out.println(b || a);
	System.out.println(a || a);
	System.out.println(b || b);
	
	
	System.out.println(!a);
	System.out.println(!b);
	
	}


}
