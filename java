Java code


package chater8;

public class ShapePrac {
	
	double calcArea(double height, double width) {
		double rectArea = height*width;
		return rectArea;
	}
	
	double calcArea(int radius) {
		double circleArea = 3.14*radius*radius;
		return circleArea;
	}
	
	double calcArea(double height, double width,double depth) {
		double triArea = height*width*depth;
		return triArea;
	}

}