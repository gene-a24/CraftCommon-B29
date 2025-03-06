package chater8;

public class Patter_Overloading {

	public void display() {
		for (int i =0; i<10; i++) {
			System.out.print("*");
		}
	}
	
	public void display(char symbol) {
		for (int i =0; i<10; i++) {
			System.out.print(symbol);
		}
	}
}
