package chapter10Ex;

public class SavingsAccount extends BankAccount {
	private double interestRate; // 이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	public String getAccountType() { // 당좌 예금
		return "저축예금";
	}

	public void updateBalance(int period) {
		this.balance += balance * interestRate * period;
	}
}
