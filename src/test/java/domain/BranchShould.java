package domain;

import domain.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BranchShould {

	@Mock
	CustomerService customerService;

	@Test
	public void create_a_new_instance_of_a_customer() {
		String name = "Tim";
		int balance = 1000;
		Branch branch = new Branch("Stroud", customerService);
		branch.addCustomer(name, balance);
		verify(customerService).createCustomer(name, balance);
	}
}