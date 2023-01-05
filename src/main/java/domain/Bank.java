package domain;

import domain.services.CustomerService;

import java.util.ArrayList;

public class Bank {

	CustomerService customerService;
	private final Printer printer;

	ArrayList<Branch> branches = new ArrayList<>();

	public Bank(CustomerService customerService, Printer printer) {
		this.customerService = customerService;
		this.printer = printer;
	}

	public Branch createBranch(String branchName) {
		Branch newBranch = new Branch(branchName, customerService);
		branches.add(newBranch);
		return newBranch;
	}

	public String printCustomers(Branch branchName) {
		return printer.printBranchCustomers(branchName);
	}

	public ArrayList<Branch> allBranches() {
		return branches;
	}


	public void addCustomer(String customerName, double initialBalance, Branch branch) {
		if (checkBranchIsMemberOfThisBank(branch)) {
			branch.addCustomer(customerName, initialBalance);
		} else {
			throw new RuntimeException();
		}
	}

	private boolean checkBranchIsMemberOfThisBank(Branch branch) {
		for (Branch checkedBranch : branches) {
			if (checkedBranch.getBranchName().equals(branch.getBranchName())) {
				return true;
			}
		}
		return false;
	}


}