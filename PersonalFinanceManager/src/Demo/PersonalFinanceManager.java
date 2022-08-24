package Demo;

import java.util.Scanner;

public class PersonalFinanceManager {
	;

	private int AccountNumber;
	int AccountBalance = 0;
	private String AccountDetails = "Account Details From Pro";
	
	
	public String getAccountDetails(String tDetails) {
		return AccountDetails;
	}
	public void setAccountDetails(String AccountDetails) {
		this.AccountDetails = AccountDetails;
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return  AccountBalance;
	}
	public void setAccountBalance(int AccountBalance) {
		//int amount = sc.nextInt();
		//System.out.println("Enter amount: ");
		this.AccountBalance = AccountBalance ;
		
	}
	
	
	public PersonalFinanceManager addAccount(String name, int age) {
		return new PersonalFinanceManager();
		
	}

	
	
}
