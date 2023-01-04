package domain.services;

import domain.Customer;

public class CustomerService {

	public Customer createCustomer(String name, double initialBalance) {
		return new Customer(name, initialBalance);
	}
}
