package com.capgemini.BankApp.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.BankApp.model.BankAccount;

public class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void setUp() {
		account = new BankAccount(101,"John","Saving",35000);
	}

	@Test
	public  void testBankAccountObjectIsCreatedWithDefaultConstructor() {
		BankAccount account = new BankAccount();
		assertNotNull(account);
	}
	
	@Test
	public  void testBankAccountObjectIsCreatedWithParamerizedConstructor() {
		BankAccount account = new BankAccount(101,"John","Saving",45000);
		assertNotNull(account);
		assertEquals(101, account.getAccountId());
		assertEquals("John", account.getAccountHolderName());
		assertEquals("Saving", account.getAccountType());
		assertEquals(45000.0, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testBankAccountCurrentBalance() {
		assertEquals(35000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithSufficientBalance() {
		account.withdraw(5000);
		assertEquals(30000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithInSufficientBalance() {
		account.withdraw(45000);
		assertEquals(35000, account.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDeposit() {
		account.deposit(5000);
		assertEquals(40000, account.getAccountBalance(),0.01);
	}
}
