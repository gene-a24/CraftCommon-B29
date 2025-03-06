package chater9;

abstract class ZclassAB{
	
	abstract void callme();
	
	void callmetoo() {
		System.out.println("This is concrate method");
	}
	
}

class B extends ZclassAB{

	@Override
	void callme() {
		// TODO Auto-generated method stub
		
		System.out.println("Implementation of callme by object B");
		
		
	}
	
}


public class AbstractmainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZclassAB AB = new B(); //UPCASTING
		AB.callme();
		AB.callmetoo();
		
		//B AB = new B();
		//AB.callme();

	}

}
