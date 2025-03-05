package chater7;

public class EncapsulationOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeeinfo emp = new Employeeinfo();
		
		emp.setEmpFirstName("Danny");
		emp.setEmpLastName("Smith");
		emp.setEmpAge(24);
		emp.setEmpSalary(12020);
		emp.setEmpBouns(6000);
		
		
		System.out.println("Employee First name: " +emp.getEmpFirstName());
		System.out.println("Employee Last name:"+ emp.getEmpLastName());
		System.out.println("Employee Age:"+ emp.getEmpAge());
		System.out.println("Employee Salary:"+ emp.getEmpSalary());
		System.out.println("Employee Bouns:"+ emp.getEmpBouns()); 
		
		
		System.out.println("\n");
		
		Account mvp = new Account();
		
		mvp.setAccountName("Bank of America");
		mvp.setAccountNumber(1200533799);
		mvp.setAccountDeposit(-800);
		mvp.setAccountBalance(26000);
		
		System.out.println("Account name:"+ mvp.getAccountName());
		System.out.println("Account number:"+ mvp.getAccountNumber());
		System.out.println("Account deposit:"+ mvp.getAccountDeposit());
		System.out.println("Account blance:"+ mvp.getAccountBalance());
		
		
		
		
		
		
		
		

	}
	
	

}
