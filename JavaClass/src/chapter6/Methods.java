package chapter6;
this is java files
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 =20;
		int result = num1 + num2;
		System.out.println(result);
		
		
		
		num1 = 100;
		num2 = 200;
		result = num1 + num2;
		
		System.out.println(result);
		
		num1 = 150;
		num2 = 300;
		result = num1 + num2;
		
		System.out.println(result);
		
		Methods obj = new Methods();
		// calling method
		
		obj.add(10, 20);
		obj.add(100, 200);
		obj.add(150, 300);
		
		System.out.println(result);

	}
	
	// public, private --access mode
	//static-- we can access with out creating object
	//return type : int, string, boolean, double, float

	private void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
