package chater8;

class Animal{
	
	void eat() {
	System.out.println("Animal eating human food");
	}
}

class Dog extends Animal{
	
	void dance() {
		System.out.println("Dogs dancing like human");
		
	}

	

	@Override
	void eat() {
	System.out.println("Dogs eating human food");
	
	}
	}

public class MethodOverridingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog Oriding = new Dog();
		
		Oriding.eat();
		Oriding.dance();
		

	}

}
