package Demo;

import java.util.Scanner;

public class PersonalFinanceManagerService {
	//Scanner sc = new Scanner(System.in);
	//int amount = sc.nextInt();
	//int addAmount = sc.nextInt();
	
	
	public PersonalFinanceManagerPro addProAccount() {
		return new PersonalFinanceManagerPro();
	}
	public int currentBalance() {
		return currentBalance();
		
	}
	public int addBalance(int addAmount) {
		return  currentBalance() + addAmount;
		
	}
	
	public int transferMoney(int balance) {
		return balance;
		
	}
	
//	public int withdrawMoney(int balance) {
//		return currentBalance()- amount;
//		
//		
//	}

}
