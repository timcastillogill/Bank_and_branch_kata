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
		Customer newCustomer = new Customer(customerName, initialTransactionAmount);
		branchCustomers.add(newCustomer);
	}

	public ArrayList<Customer> allCustomers() {
		return branchCustomers;
	}

	public void depositTransaction(Customer customer, double deposit) {
		if (checkCustomerMemberOfBranch(customer)) {
			customer.addTransaction(deposit);
		} else {
			throw new RuntimeException();
		}
}

	private boolean checkCustomerMemberOfBranch(Customer customer) {
		for (Customer checkedCustomer : branchCustomers) {
			if (checkedCustomer.getName().equals(customer.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getBranchName() {
		return branchName;
	}
}
