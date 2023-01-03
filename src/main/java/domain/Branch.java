package domain;

import domain.services.CustomerService;

public class Branch {

	private final String branchName;
	private final CustomerService customerService;

	public Branch(String branchName, CustomerService customerService) {
		this.branchName = branchName;
		this.customerService = customerService;
	}

	public void addCustomer(String customerName, int initialTransactionAmount) {
		customerService.createCustomer(customerName, initialTransactionAmount);
	}
}
