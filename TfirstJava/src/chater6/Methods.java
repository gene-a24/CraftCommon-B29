package chater6;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods obj = new Methods();
		
		int x = obj.add(10,20);
		
		System.out.println(x);
		
		obj.add(100,200);
		

		/*int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);*/
	}
	
	int add(int x, int y) {
		int result = x+y;
		
		return result;
		//System.out.println(result);
	}

}
