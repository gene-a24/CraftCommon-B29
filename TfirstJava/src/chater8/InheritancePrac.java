package chater8;

class Calculation {
	 int z;
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the  given numbers:"+z);

}
	   public void Subtraction(int x, int y) {
		      z = x - y;
		      System.out.println("The difference between the given numbers:"+z);
	   }
	   
}

class My_Calculation extends Calculation{
	   public void Mulitiplication(int x, int y) {
		   z = x*y;
		   System.out.println("The produce of between the given numbers:"+z);
	   }
	   
	
	
}

class My_Calculation2 extends My_Calculation{
	
	 public void Divison(int x, int y) {
		   z = x/y;
		   System.out.println("The Divison of the given numbers is:"+z);
	   }
	
}

public class InheritancePrac {
	public static void main(String[] args) {
		
		/*Calculation calc = new Calculation();
		calc.addition(120, 98);
		
		calc.Subtraction(650, 50);*/
		
		//System.out.println("\n");
		
		My_Calculation2 MyCalc = new My_Calculation2();
		MyCalc.addition(120, 98);
		MyCalc.Subtraction(650, 50);
		MyCalc.Mulitiplication(20, 50);
		MyCalc.Divison(200, 50);
		
		
		
		
	}
}


