
public class SavingsAccount extends BankAccount {
	
	private double rate = 0.0025;
	private int savingsNumber = 0;
	private String accountNumber;
	private String owner;

	
	public SavingsAccount(String owner, double accountNumber) {
		
		super(owner, accountNumber);
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}

	public void postInterest() {
		
		this.setBalance((this.getBalance() * this.rate) + this.getBalance());
	}

	@Override
	public String getAccountNumber(){
		
		return this.accountNumber + "-" + savingsNumber;
	}
	
	public SavingsAccount(BankAccount owner, double accountNumber) {

		super(owner, accountNumber);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber();
		this.setAccountNumber(this.accountNumber);
	}
}