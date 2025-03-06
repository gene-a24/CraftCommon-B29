package chapter2;

public class ArithmeticOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result, x,y;
		
		x= 10;
		y= 20;
		
		result = x+y;
		System.out.println("addtion:"+result);

		result = x-y;
		System.out.println("substraction:"+result);
				
		result = x*y;
		System.out.println("muliplication:"+result);
		
		result = x/y;
		System.out.println("division:"+result);
		
		result = x%y;
		System.out.println("remainder:"+result);
		
		double result1 = Math.pow(x, y);
		System.out.println("power:"+result);
		
		result = x=++x;
		System.out.println("increment:"+result);
		
		result = y=--y;
		System.out.println("decrement:"+result);
		
		
	}

}
