package chater8;

class Animal1{
	String color = "Pink";
}

class Bear extends Animal1{
	String color = "Green";
	
	void display() {
		System.out.println("Bitch it's:"+color);
		System.out.println("Bitch it's super:"+super.color);
	}
}

public class OverridingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Bear MO = new Bear();
		MO.display();
			      
	}

}
