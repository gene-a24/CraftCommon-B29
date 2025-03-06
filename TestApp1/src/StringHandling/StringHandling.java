package StringHandling;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st1 = new String();
		String st2 = new String();
		String st3 = new String();
		st1= "I" + " Like";
		st2 = "ati";
		st3 = "aTi";
		System.out.println(st1.length());
		System.out.println(st1.charAt(2));
		System.out.println(st2.equals(st3));
		System.out.println(st2.equalsIgnoreCase(st3));
		System.out.println(Character.isDigit('1'));
		System.out.println(st1.substring(1));
		System.out.println(st1.substring(1,3));
		System.out.println(st1.toLowerCase());
		System.out.println(st1.trim());
		
	}

}
