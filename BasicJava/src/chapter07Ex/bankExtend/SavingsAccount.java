package chapter07Ex.bankExtend;

public class SavingsAccount extends BankAccount{
	private double interestRate; //이자율
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		this.balance += balance * interestRate * period;
	}
}
