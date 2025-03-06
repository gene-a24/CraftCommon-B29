package chater9;

// Abstract class
abstract class Figure{   
	
	// Abstract method
	abstract void calcArea(double length);
}

// child class which inherited the abstract class 
public class FigurePrac extends Figure {

	
	// the implementation of the abstract class 
	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub
		
		double rectArea= length * length;
		System.out.println("Area of rectangle:" + rectArea);
		
	}
	
	// main class we can create object and access it 
	public static void main(String[] args) {
		
		FigurePrac F = new FigurePrac();
		F.calcArea(30);
		
		
	}

}
