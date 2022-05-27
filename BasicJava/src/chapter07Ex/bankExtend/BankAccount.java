package chapter07Ex.bankExtend;

public class BankAccount {
	protected int balance; //잔액
	
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	
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
			withdraw(amount);
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "잔액: " + getBalance();
	}
}
