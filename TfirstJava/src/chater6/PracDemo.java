package chater6;

public class PracDemo {


		int age = 23;
		
		public void method1() {
			
			int S = 11;
			System.out.println("the value of S:"+S);
			System.out.println("the value age:"+age);
			
		}
		
		public void method2() {
			
			String message = "I kinda love Java";
			System.out.println("The message is:"+message);
		}
		
		public void method3() {
			double salary = 11963.33;
			double bouns = 20693.99;
			System.out.println("Monthly Salary:"+salary);
			System.out.println("Six mouth bouns:"+bouns);
			System.out.println(salary+bouns);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			PracDemo var = new PracDemo ();
			
			var.method1();
			var.method2();
			var.method3();
			
		
			
		}
}


