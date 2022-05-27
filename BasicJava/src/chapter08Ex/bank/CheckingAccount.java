package chapter08Ex.bank;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public String getAccountType() { // 당좌 예금
		return "당좌예금";
	}

	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.withdraw(amount - balance);
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}
}