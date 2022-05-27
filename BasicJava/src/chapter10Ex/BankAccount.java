package chapter10Ex;

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
		if (balance - amount >= 0) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < 0 || balance < amount) {
			throw new IllegalArgumentException();// 에러를 만들어서 던져줌
		} if (otherAccount == null) {
			throw new NullPointerException(); //이 경우 이러한 에러를 발생시켜라.
		}
		balance = 0;
		otherAccount.deposit(amount);

		return true;
	}

	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
}
