package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class BankingFeatureShould {

	@Test
	public void shows_a_list_of_customers_for_a_branch() {
		CustomerService customerService = new CustomerService();
		Printer printer = new Printer();
		Bank bank = new Bank(customerService, printer);
		Branch stroudBranch = bank.createBranch("Stroud");
		stroudBranch.addCustomer("Tim", 1000);
		stroudBranch.addCustomer("Hassan", 2000);
		assertThat(bank.printCustomers(stroudBranch)).isEqualTo("Tim, Hassan");
	}

//	@Test
//	public void shows_a_list_of_customers_for_a_branch() {
//		CustomerService customerService = new CustomerService();
//		Printer printer = new Printer();
//		Bank bank = new Bank(customerService, printer);
//		Branch stroudBranch = bank.createBranch("Stroud");
//		stroudBranch.addCustomer("Tim", 1000);
//		stroudBranch.addCustomer("Hassan", 2000);
//		assertThat(bank.printCustomers(stroudBranch)).isEqualTo("Tim, Hassan");
//	}
}
