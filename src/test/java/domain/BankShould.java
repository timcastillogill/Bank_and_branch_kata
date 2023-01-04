package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
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
	private Bank bank;

	@BeforeEach
	void setUp() {
		bank = new Bank(customerService, printer);
	}

	@Test
	public void create_a_new_branch_for_that_bank() {
		assertThat(bank.createBranch("Stroud")).isInstanceOf(Branch.class);
	}

	@Test
	public void print_a_list_of_customers_for_a_related_branch() {
		String branchName = "Stroud";
		bank.printCustomers(branchName);

		verify(printer).printBranchCustomers(branchName);
	}

}