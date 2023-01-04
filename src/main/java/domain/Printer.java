package domain;

import java.util.ArrayList;

public class Printer {

	public String printBranchCustomers(Branch branch) {
		StringBuilder customerString = new StringBuilder();
		ArrayList<Customer> customerList = branch.allCustomers();
		for (Customer customer : customerList) {
			customerString.append(customer.getName()).append(", ");
		}
		return customerString.toString().replaceAll(", $", "");
	}
}
