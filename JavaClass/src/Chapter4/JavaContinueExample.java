package Chapter4;

public class JavaContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++)  {
			if(i == 5)  {
			System.out.println("Skipping i =" +i);
			continue; // Skip the rest of the loop when i is 5
			}
			System.out.println("i =" + i);
		}

	}

}
