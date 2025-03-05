package com.oop.encapsulation;

public class AccountInfo {
	
	private String fullName;
	private Long accountNumber;
	private double depositAmount;
	private double accountBalance;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		if(depositAmount >=100) {
		this.depositAmount = depositAmount;
		}
		else {
			System.err.println("It's not allowed to deposit below 100$");
		}
	}
	
	public double getAccountBalance() {
		return accountBalance + depositAmount;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
