package com.oop.encapsulation;

public class EncapuslationMainDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EncapsulationDemo1 e1 = new EncapsulationDemo1();
//		
//		e1.setAge(-20);
//		e1.setSalary(50000);
//		
//		System.out.println("Age: " + e1.getAge());
//		System.out.println("Salary: " + e1.getSalary());
		
		AccountInfo acc = new AccountInfo();
		
		acc.setFullName("Jamie Foxx");
		acc.setAccountNumber(123456789009876L);
		acc.setDepositAmount(500);
		acc.setAccountBalance(1000);
		
		System.out.println("Customers Full Name: " +  acc.getFullName());
		System.out.println("Customers Account Number: " +  acc.getAccountNumber());
		System.out.println("Customers Deposit: " +  acc.getDepositAmount());
		System.out.println("Customers Account Balance: " +  acc.getAccountBalance());

	}

}
