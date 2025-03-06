package Chapter2;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is cause an error
		// System.out.println("Value of localVar: " + localVar);
		// Uncomment to see the error
		}
public static void display() {
	int localVar = 10;
	System.out.println("Local variable:" + localVar);
}
}
