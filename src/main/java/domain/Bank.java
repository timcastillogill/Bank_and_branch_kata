package domain;

import domain.services.CustomerService;

public class Bank {

	CustomerService customerService;

	public Bank(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Branch createBranch(String branchName) {
		return new Branch(branchName, customerService);
	}

	public String printCustomers(String branchName) {
		throw new UnsupportedOperationException();
	}
}
