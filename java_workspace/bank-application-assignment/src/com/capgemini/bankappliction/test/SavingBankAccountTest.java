package com.capgemini.bankappliction.test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankappliction.exception.DebitLimitExceededException;
import com.capgemini.bankappliction.exception.LowBalanceException;
import com.capgemini.bankappliction.main.SavingBankAccount;

public class SavingBankAccountTest {

	SavingBankAccount savingsAccount;

	@Before
	public void setUp() {
		savingsAccount = new SavingBankAccount(101, "bob" ,24000,true);
	}

	@Test
	public void tesBankAccountIsCreatedWithDefaultConstructor() {
		SavingBankAccount savingsAccount = new SavingBankAccount();
		assertNotNull(savingsAccount);
	}
	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, savingsAccount.getAccountId());
		assertEquals("bob", savingsAccount.getAccountHolderName());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertTrue(savingsAccount.isSalaryAccount());
		
	}
	
	@Test
	public void tesBankAccountIsCreatedWithParametrizedConstructorSavedAccountFalse() {
		SavingBankAccount savingsAccount = new SavingBankAccount(101, "bob" ,24000,false);
		assertEquals(101, savingsAccount.getAccountId());
		assertEquals("bob", savingsAccount.getAccountHolderName());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertFalse(savingsAccount.isSalaryAccount());
		
	}
	@Test
	public void testWithdrawSalaryAccountWithSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		savingsAccount.withdraw(5000);
		assertEquals(19000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawSalaryAccountWithInSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		savingsAccount.withdraw(25000);
		
	}
	@Test
	public void testWithdrawWithSalaryAccountWithSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		SavingBankAccount savingsAccount = new SavingBankAccount(101, "bob" ,24000,false);
		savingsAccount.withdraw(5000);
		assertEquals(19000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawWithoutSalaryAccountWithInSufficientFund() throws LowBalanceException, DebitLimitExceededException {
		SavingBankAccount savingsAccount = new SavingBankAccount(101, "bob" ,24000,false);
		savingsAccount.withdraw(18000);
		
	}

}
