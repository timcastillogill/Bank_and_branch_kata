package domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CustomerShould {
	@Test
	public void add_intial_balance_to_transactions_list() {
		Customer newCustomer = new Customer("Tim", 1000);

		assertThat(newCustomer.allTransactions().size()).isEqualTo(1);
		assertThat(newCustomer.allTransactions().get(0)).isInstanceOf(Transactions.class);
	}

}