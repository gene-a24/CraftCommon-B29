package chater9;


class A{
	
}

public class MainIterface extends A implements Animal, dog, car {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animals eat food");
		
	}

	@Override
	public void travle() {
		// TODO Auto-generated method stub
		
		System.out.println("Animal travle the town");
		
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("god is awsome");
		
		System.out.println("Ford sucks Toyota rocks");
		
	}
	
	
	public int noOflegs() {
		return 0;
	}

	public static void main(String[] args) {
		MainIterface M1 = new MainIterface();
		M1.eat();
		M1.travle();
		M1.sound();
	}

	
}
