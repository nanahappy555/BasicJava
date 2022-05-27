package chapter08Ex.bank;

public class Customer {
	private String firstName; //고객 이름
	private String lastName; //고객 성
	private BankAccount[] accounts; //고객이 소유한 계좌
	private int numberOfAccounts; //고객이 소유한 계좌수. 최대5
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new BankAccount[5];
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount(int index) { 
		return accounts[index];
	}
	
	public void addAccount(BankAccount account) {
		this.accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
