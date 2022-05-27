package chapter07Ex;

public class Customer {
	private String firstName; //고객 이름
	private String lastName; //고객 성
	private BankAccount account; //고객이 소유한 계좌
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount() { 
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	public String toString() {
		return String.format("고객 이름: %s %s, 잔고: %,d원", getFirstName(), getLastName(), account.getBalance());
//		return String.format("고객 이름: %s %s, 잔고: %,d원", getFirstName(), getLastName(), account);
//			필드 account를 쓰고 잔액이 반환되게 하려면 BankAccount클래스에 잔액을 반환하는 toString을 추가해준다.
	}
}
