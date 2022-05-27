package chapter07Ex;

public class Bank {
	private Customer[] customers; //은행의 고객 목록
	private int numberOfCustomers; //은행의 고객 수
	
	public Bank() {
		this.customers = new Customer[10];
	}
	
	
	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers] = customer;
		numberOfCustomers++;
//		customers[numberOfCustomers++] = customer;
//		이거만 써도 됨 인덱스값을 증가
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
