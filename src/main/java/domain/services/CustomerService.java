package domain.services;

import domain.Customer;

public class CustomerService {

	public void createCustomer(String name, int initialBalance) {
		new Customer(name, initialBalance);
	}
}
