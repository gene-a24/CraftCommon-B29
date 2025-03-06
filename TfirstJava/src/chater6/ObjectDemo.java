package chater6;

public class ObjectDemo {
	
	int age = 25;
    String name = "Object Class";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectDemo firstPrac = new ObjectDemo();
		
		firstPrac.meow();
		int yr = firstPrac.age;
		String tday = firstPrac.name;
		
		System.out.println("your age:" +yr);
		System.out.println("The class lesson is:" +tday);

	}

	void message() {
		System.out.println("This is the message");
	}
	
	void meow() {
		System.out.println("This is the meow method meowww");
	}
}
