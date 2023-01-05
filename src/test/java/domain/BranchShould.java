package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BranchShould {

	@Mock
	CustomerService customerService;
	@Mock
	Customer customer;
	private Branch branch;

	@BeforeEach
	void setUp() {
		branch = new Branch("Stroud", customerService);
	}

	@Test
	public void create_a_new_instance_of_a_customer() {
		String name = "Tim";
		double balance = 1000;
		branch.addCustomer(name, balance);

		verify(customerService).createCustomer(name, balance);
		assertThat(branch.allCustomers().size()).isEqualTo(1);
	}

	@Test
	public void add_a_transaction_to_a_customer_of_that_branch() {
		branch.addCustomer("Hassan", 1000);
		given(customer.getName()).willReturn("Hassan");

		double deposit = 500.23;
		branch.depositTransaction(customer, deposit);
		verify(customer).addTransaction(deposit);
	}

}