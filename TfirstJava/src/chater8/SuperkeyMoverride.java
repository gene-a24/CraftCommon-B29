package chater8;

class Animal2{
	
	void sound() {
		System.out.print("Animal sound");
	}
}

class cat extends Animal2{
	
	@Override
	void sound() {
		System.out.println("meow meow");
	}
	
	void display() {
		sound();
		super.sound();
	}
}
	
	
	
	
public class SuperkeyMoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat SD = new cat();
		SD.display();
		
		

	}

}
