package domain;

import domain.services.CustomerService;

public class Bank {

	CustomerService customerService;
	private Printer printer;

	public Bank(CustomerService customerService, Printer printer) {
		this.customerService = customerService;
		this.printer = printer;
	}

	public Branch createBranch(String branchName) {
		return new Branch(branchName, customerService);
	}

	public String printCustomers(String branchName) {
		return printer.printBranchCustomers(branchName);
	}
}
