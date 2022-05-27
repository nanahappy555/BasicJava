package chapter08Ex.bank;

public class Bank {
	private Customer[] customers; //은행의 고객 목록
	private int numberOfCustomers; //은행의 고객 수
	
	public Bank() {
		this.customers = new Customer[10];
	}
	
	
	public void addCustomer(Customer customer) {
		int i = numberOfCustomers;
		this.customers[i] = customer;
		numberOfCustomers++;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) {
		return this.customers[index];
	}
}
