package domain;

public class Branch {

	private String branchName;

	public Branch(String branchName) {
		this.branchName = branchName;
	}

	public void addCustomer(String customerName, int initialTransactionAmount) {
		throw new UnsupportedOperationException();
	}
}
