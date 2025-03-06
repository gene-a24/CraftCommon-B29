package chater8;

public class BoxCon1 {
	
	     double width;
	     double height;                                                                
	     double depth;
	     
	     BoxCon1(){
	         width = 5;
	         height = 10;
	         depth = 3;
	        }
	     BoxCon1(double w,double h,double d){
	         width = w;
	         height = h;
	         depth = d;
	        }
	     double volume(){
	        return width * height * depth;

	   
	}

}
