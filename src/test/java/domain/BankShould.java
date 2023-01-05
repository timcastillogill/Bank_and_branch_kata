package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BankShould {

	@Mock
	CustomerService customerService;

	@Mock
	Printer printer;

	@Mock
	Branch branch;
	private Bank bank;

	@BeforeEach
	void setUp() {
		bank = new Bank(customerService, printer);
	}

	@Test
	public void create_a_new_branch_for_that_bank() {
		assertThat(bank.createBranch("Stroud")).isInstanceOf(Branch.class);
		assertThat(bank.allBranches().size()).isEqualTo(1);
	}

	@Test
	public void print_a_list_of_customers_for_a_related_branch() {
		bank.printCustomers(branch);

		verify(printer).printBranchCustomers(branch);
	}

	@Test
	public void add_a_customer_to_a_branch_of_that_bank() {
		String name = "Hassan";
		double initialBalance = 1000.00;
		bank.createBranch("Stroud");
		given(branch.getBranchName()).willReturn("Stroud");

		bank.addCustomer(name, initialBalance, branch);
		verify(branch).addCustomer(name, initialBalance);
	}

}