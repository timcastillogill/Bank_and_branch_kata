package domain;

import domain.services.CustomerService;

import java.util.ArrayList;

public class Branch {

	private final String branchName;
	private final CustomerService customerService;
	ArrayList<Customer> branchCustomers = new ArrayList<>();

	public Branch(String branchName, CustomerService customerService) {
		this.branchName = branchName;
		this.customerService = customerService;
	}

	public void addCustomer(String customerName, int initialTransactionAmount) {
		Customer newCustomer = customerService.createCustomer(customerName, initialTransactionAmount);
		branchCustomers.add(newCustomer);
	}

	public ArrayList<Customer> allCustomers() {
		return branchCustomers;
	}
}
