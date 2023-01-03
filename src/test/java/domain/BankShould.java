package domain;

import org.junit.jupiter.api.Test;
class BankShould {

	@Test
	public void create_a_new_branch_for_that_bank() {
		Bank bank = new Bank();
		bank.createBranch("Stroud");
	}

}