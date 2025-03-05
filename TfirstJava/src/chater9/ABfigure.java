package chater9;

abstract class Figure1 {

	double dim1, dim2;

	Figure1(double a, double b) {
		dim1 = a;
		dim2 = b;

	}

	abstract void area();
}

class Rectangle extends Figure1 {

	Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double result = dim1 * dim2;

		System.out.print("Area of Rectangle:" + result);
	}
}

public class ABfigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle Ra = new Rectangle(10,12);
		Ra.area();
		

	}

}
