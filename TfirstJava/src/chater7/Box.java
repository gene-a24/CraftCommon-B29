package chater7;

public class Box {
	int width;
	int height;
	int depth;
	
	Box (){
		width =10;
		height= 12;
		depth = 14;
	}
	
	Box(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		int result = width + height + depth;
		return (double) result;
	}
	
	void setDin(int w, int h, int d) {
		width = w;
		height = h;
		depth =  d;
	}
}
