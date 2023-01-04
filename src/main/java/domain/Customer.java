package domain;

import java.util.ArrayList;

public class Customer {
	private final String name;

	ArrayList<Transactions> transactions = new ArrayList<>();

	public Customer(String name, int initialBalance) {
		this.name = name;
		addTransaction(initialBalance);
	}

	public void addTransaction(int amount) {
		transactions.add(new Transactions(amount));
	}

	public ArrayList<Transactions> allTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}
}
