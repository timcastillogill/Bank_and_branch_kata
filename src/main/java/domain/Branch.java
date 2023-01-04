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

	public void addCustomer(String customerName, double initialTransactionAmount) {
		Customer newCustomer = customerService.createCustomer(customerName, initialTransactionAmount);
		branchCustomers.add(newCustomer);
	}

	public ArrayList<Customer> allCustomers() {
		return branchCustomers;
	}

	public void depositTransaction(Customer customer, double deposit) {
		findCustomer(customer).addTransaction(deposit);
	}

	private Customer findCustomer(Customer customer) {
		for (int i = 0; i < branchCustomers.size(); i++) {
			Customer checkedCustomer = branchCustomers.get(i);
			if (checkedCustomer.getName().equals(customer.getName())) {
				return checkedCustomer;
			}
		}
		return null;
	}
}
