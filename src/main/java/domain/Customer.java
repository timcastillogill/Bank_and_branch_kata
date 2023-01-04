package domain;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int initialBalance;

	ArrayList<Transactions> transactions = new ArrayList<Transactions>();

	public Customer(String name, int initialBalance) {
		this.name = name;
		this.initialBalance = initialBalance;
		addTransaction(initialBalance);
	}

	public void addTransaction(int amount) {
		transactions.add(new Transactions(amount));
	}

	public ArrayList<Transactions> allTransactions() {
		return transactions;
	}
}
