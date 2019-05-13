package com.capgemini.bankappliction.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankappliction.exception.DebitLimitExceededException;
import com.capgemini.bankappliction.exception.LowBalanceException;
import com.capgemini.bankappliction.main.BankAccount;

public class BankAccountTest {

	private BankAccount account;

	@Before
	public void setUp() {
		account = new BankAccount(101, "bob", "Saving", 24000);
	}

	@Test
	public void tesBankAccountIsCreatedWithDefaultConstructor() {
		BankAccount account = new BankAccount();
		assertNotNull(account);
	}

	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructor() {
		BankAccount account = new BankAccount(101, "bob", "Saving", 44000);
		assertNotNull(account);
		assertEquals(101, account.getAccountId());
		assertEquals("bob", account.getAccountHolderName());
		assertEquals("Saving", account.getAccountType());
		assertEquals(44000.0, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testBankAccountCurrentBalance() {
		assertEquals(24000, account.getAccountBalance(), 0.01);

	}

	@Test
	public void testWithdrawWithSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		account.withdraw(5000);
		assertEquals(19000, account.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawWithInSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		account.withdraw(25000);
		
	}
	
	@Test
	public void testDeposit() {
		account.deposit(10000);
		assertEquals(34000, account.getAccountBalance(),0.01);
		
	}

}
