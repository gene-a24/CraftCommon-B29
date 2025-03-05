package chater9;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name = "Liyaaaa";
		
		/*String name = new String("Liya");
		
		System.out.println(name.concat(" sofi"));
		
		System.out.println(name);
		
		System.out.println("\n");
		
		
		String Snew = "I" + " like" + " Injera";
		
		System.out.println(Snew);
		
		int len = Snew.length();
		
		System.out.println("Length of String:" + len);
		
		
		String Snew2 = "This is Sammy";
		//System.out.println(Snew2.charAt(Snew2.length()-1));
		System.out.println(Snew2.charAt(5));
		
		String Snew3 = "Dickson";
		String Snew4 = "dickson";
		
		if(Snew3.equalsIgnoreCase(Snew4)) {
			System.out.println("The two string are Equal");
		}
		else {
			System.out.println("The two string are NOT equal");
		}
		
		 System.out.print("\n");
		
		String Snew5 = "5boooool3";
		char ch;
		for(int i=0;i<Snew5.length();i++) {
		ch = Snew5.charAt(i);
		System.out.println(ch);
		if(Character.isDigit(ch)) {
			continue;
		}
		
		else {
			System.out.println("String contains NON digits");
		}
		
		
		System.out.println("\n"); */
		
		
		
		String Snew6 = "Today is holiday. Tomorrow is working day.";
		
		int loc = Snew6.indexOf("holiday");
		System.out.println("Position of holiday:"+ loc);
		
		
		
		String sub1 = Snew6.substring(18);
		System.out.println("subString:" + sub1);
		
		String[] arry = Snew6.split(" ");
		
		for(String elt: arry) {
			System.out.println(elt);
			
			String Snew7 = "Hollo";
			String Snew8 = Snew7.replace('l', 'm');
			
			System.out.println( Snew8);
		}
		
		
	}

}
