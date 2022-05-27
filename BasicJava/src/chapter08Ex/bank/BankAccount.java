package chapter08Ex.bank;

public abstract class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	
	public abstract String getAccountType();
	
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if(balance-amount >= 0) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
}
