package domain;

public class Bank {

	public Branch createBranch(String branchName) {
		return new Branch(branchName);
	}

	public String printCustomers(String branchName) {
		throw new UnsupportedOperationException();
	}
}
