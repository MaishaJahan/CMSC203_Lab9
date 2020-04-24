
public class CheckingAccount extends BankAccount {
	
	private static double FEE = 0.15;
	private String accountNumber;
	private String owner;

	public CheckingAccount(String owner, double account) {
		
		super(owner, account);
		this.accountNumber = this.getAccountNumber() + ("-10");
		this.setAccountNumber(this.accountNumber);
		this.owner = owner;
	}

	@Override 
	public boolean withdraw (double account) {
		
		if (account > this.getBalance()) { 
			return false; 
			}
		else if ((account + FEE) > this.getBalance()) { 
			return false;
			}

		boolean withdrawal = super.withdraw( account + FEE);

		return withdrawal;
	}
}