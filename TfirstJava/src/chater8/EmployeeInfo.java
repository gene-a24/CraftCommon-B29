package chater8;

public class EmployeeInfo {
	
	static String myname = "Sam Smith";
	static int age = 24;
	int salary = 20000;
	
  public static void getEmpDetails(){

	System.out.println("Name: "+ myname);
	System.out.println("Age: "+ age);
	//System.out.println("Salary: "+ salary);    	   
   
  
  
  System.out.println("\n");
  
  }
  
  public  void printEmpDetails(){
	    System.out.println("Name: "+ myname);
	    System.out.println("Age: "+ age);
	    System.out.println("Salary: "+ salary);	    	     }



	  public static void main(String[] args) {
		  EmployeeInfo .getEmpDetails();  //  Allowed to call without object creation 
	     //EmpClass2.printEmpDetails();   // Not Allowed 
		  
		  EmployeeInfo NS = new EmployeeInfo();
		  
		  NS.printEmpDetails();
		   
		  //System.out.println(NS.salary);
			}
	  



}

