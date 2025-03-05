package chater7;

public class Account {
	
	private String accountName;
	private int accountNumber;
	private double accountDeposit;
	private double accountBalance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(double accountDeposit) {
		
		if(accountDeposit > 100) {
		this.accountDeposit = accountDeposit;
		}
		
		else {
			System.err.println("Deposit under 100$ not allowed");
		}
	}
	public double getAccountBalance() {
		return accountBalance + accountDeposit;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}