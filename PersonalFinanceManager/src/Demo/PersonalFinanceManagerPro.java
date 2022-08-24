package Demo;

public class PersonalFinanceManagerPro extends PersonalFinanceManager{
	private int AccountPro;
	private int AccountOverDraftBalance;
	private String AccountDetails = "Account Details From Pro";
	
	public String accountDetails() {
		return AccountDetails;
		
	}
	public static void main(String[] args) {
		PersonalFinanceManager PM = new PersonalFinanceManager();
		
		//PM.setAccountBalance(1000);
		//System.out.println(PM.getAccountBalance());
		
		//PersonalFinanceManagerService PS = new PersonalFinanceManagerService();
		//PS.withdrawMoney(500);
	//	System.out.println(PM.getAccountBalance());
	//	PM.(1000);
		System.out.println(PM.getAccountDetails(""));
		

		//PS.currentBalance();
		PM.addAccount("Mighty", 20);
		
	}
	
	

}
