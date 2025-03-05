package chater8;

public class StaticDemo {

	static int height = 34;
	static int weight = 70;
	public static void printPersonalDetails() {
		System.out.println("Weight of person:"+ weight);
	
	}

	
	//public class StaticDemo2 {
		public static void main(String[] args) {
				System.out.println("Height of person:" + StaticDemo.height);
				
				StaticDemo .printPersonalDetails();
				
				StaticDemo .weight = 75;
				
				StaticDemo .printPersonalDetails();	
}
}