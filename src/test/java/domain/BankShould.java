package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BankShould {

	@Mock
	CustomerService customerService;

	@Test
	public void create_a_new_branch_for_that_bank() {
		Bank bank = new Bank(customerService);
		bank.createBranch("Stroud");
	}

}