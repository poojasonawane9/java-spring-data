package com.capgemini.bankappliction.main;

import com.capgemini.bankappliction.exception.DebitLimitExceededException;
import com.capgemini.bankappliction.exception.LowBalanceException;

public class SavingBankAccount extends BankAccount {

	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 10000;
	
	
	public SavingBankAccount() {
		super();
	}

	public SavingBankAccount(long accountId, String accountHolderName,  double accountBalance,boolean salaryAccount) {
		super(accountId, accountHolderName, "Savings", accountBalance);
		this.salaryAccount = salaryAccount;
		
	}

	public boolean isSalaryAccount(boolean salaryAccount) {
		return true;
	}
	

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	

	public double withdraw(double amount) throws LowBalanceException, DebitLimitExceededException {
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				throw new LowBalanceException("You dont have sufficient balance");
			return getAccountBalance();
		}
	}
	
	@Override
	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Salary Account: " + salaryAccount);
	}

}
