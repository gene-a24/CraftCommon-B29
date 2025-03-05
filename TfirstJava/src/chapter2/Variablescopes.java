package chapter2;

public class Variablescopes {
	
	int y = 20; 
	static int z = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
			
			int x = 10;
			 
			System.out.println(x);
			
			
			Variablescopes mysub = new Variablescopes();
			System.out.println(mysub.y);
			
			System.out.print(mysub.z);
			
		
			
			

	}

}
