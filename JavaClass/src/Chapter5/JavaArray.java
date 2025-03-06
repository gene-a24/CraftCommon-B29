package Chapter5;

public class JavaArray {

	public static void main(String[] args) {
		// Creating array in java 
		// method1
		
	int[] numberlist = new int[10];
	   
	   numberlist[0] = 20;
	   numberlist[1] = 14;
	   numberlist[2] = 77;
	   numberlist[3] = 100;
	   numberlist[4] = 120;
	   numberlist[5] = 180;
	   numberlist[6] = 200;
	   numberlist[7] = 230;
	   numberlist[8] = 270;
	   numberlist[9] = 290;
	   
	   //method2
    int[]numberslist2 = {20, 14,77,100,120,180,200,230,270,290};
    
    //access of array elements
    System.out.println(numberlist[1]);
    
    
      System.out.println(numberlist[0]);
      System.out.println(numberlist[1]); 
      System.out.println(numberlist[2]);
      System.out.println(numberlist[3]);
      System.out.println(numberlist[4]); 
      System.out.println(numberlist[5]);
      System.out.println(numberlist[6]);
      System.out.println(numberlist[7]);
      System.out.println(numberlist[8]);
      System.out.println(numberlist[9]);
      
      // size of array
      System.out.println(numberslist2.length);   
      
      // loop array
      for(int x = 0; x < numberslist2.length; x++)  {
    	 System.out.println(numberslist2[x]);
      }
      
	}

      
}


