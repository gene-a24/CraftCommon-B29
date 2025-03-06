package chapter2;

public class Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a&&b="+(a&&b));
		System.out.println("a&&a="+(a&&a));
		System.out.println("b&&b="+(b&&b));
		
		System.out.println("a||b ="+(a||b));
		System.out.println("a||a ="+(a||a));
		System.out.println("b||b ="+(b||b));
		
		System.out.println("!(a&&b)="+!(a&&b));
		System.out.println("!(a&&a)="+!(a&&a));
		System.out.println("!(b&&b)="+!(b&&b));
	}

}
