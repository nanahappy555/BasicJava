package chapter07Ex;

public class BankAccount {
	private int balance; //잔액
	
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if(this.balance-amount >= 0) {
			this.balance -= amount;
			return true;
		}
		return false; //맞게썼음
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(this.withdraw(amount) == true) {
//			this.withdraw(amount);  if문에서 withdraw가 실행되기 때문에 또 적으면 두번 출금됨
			otherAccount.deposit(amount);
		}
		return true; //원래는 if내부에 return true 외부에 return false까지 써주는게 좋음(위에 withdraw처럼) 근데 BankTest에서 true만 반환해도 성립되게 적혀있어서 상관없음
	}//if를 만족하면 송금실행, 만족하지 못하면 아무 동작도 하지 않음.
}
