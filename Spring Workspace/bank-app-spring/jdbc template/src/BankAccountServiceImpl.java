package com.capgemini.bankapp.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.util.DbUtil;
import org.springframework.transaction.annotation.*;

@Transactional
public class BankAccountServiceImpl implements BankAccountService{

	static final Logger logger=Logger.getLogger(BankAccountServiceImpl.class);
	
	private BankAccountDao bankAccountDao;
	
	public BankAccountServiceImpl( BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		boolean result = bankAccountDao.addNewBankAccount(account);
			return result;
	}
	
	@Override
	public boolean deleteBankAccount(long accountId) throws  BankAccountNotFoundException{
		boolean result = bankAccountDao.deleteAccount(accountId);
		if(result) {
			return result;
		}
		throw new BankAccountNotFoundException("BankAccount doesn't exist....");
	}

	@Override
	public boolean updateBankAccountDetails(long accountId,String accountHolderName,String accountType) {
		boolean result =  bankAccountDao.updateBankAccountDetails(accountId,accountHolderName,accountType);
		return result;
	}

	@Override
	public BankAccount searchCustomerRecord(long accountId) throws BankAccountNotFoundException {
		BankAccount account = bankAccountDao.searchCustomerRecord(accountId);
		if(account != null)
			return account;
		throw new BankAccountNotFoundException("BankAccount doesn't exist");
	}

	@Override
	public double checkBalance(long accountId) throws BankAccountNotFoundException{
		double balance = bankAccountDao.getBalance(accountId);
		if(balance >= 0){
			return balance;
		}
		throw new BankAccountNotFoundException("BankAccount Doesn't exist");
	}

	@Override
	public double withdraw(long accountId, double amount) throws LowBalanceException,BankAccountNotFoundException {
		double balance =bankAccountDao.getBalance(accountId);
		if(balance < 0)
			throw new BankAccountNotFoundException("BankAccount Doesn't exist");
		else if(balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			return balance;
		}
		else
			throw new LowBalanceException("You don't have sufficient fund");
	}

	@Override
	public double deposit(long accountId, double amount) throws BankAccountNotFoundException{
		double balance = bankAccountDao.getBalance(accountId);
		if(balance < 0)
			throw new BankAccountNotFoundException("BankAccount not found");
		balance = balance + amount;
		bankAccountDao.updateBalance(accountId, balance);
		return balance;
	}

	@Override
	public List<BankAccount> findAllBankAccount() {
		return bankAccountDao.findAllbankAccounts();
	}

	public double withdrawForFundTransfer(long accountId, double amount) throws LowBalanceException,BankAccountNotFoundException {
		double balance =bankAccountDao.getBalance(accountId);
		if(balance < 0)
			throw new BankAccountNotFoundException("BankAccount Doesn't exist");
		else if(balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			return balance;
		}
		else
			throw new LowBalanceException("You don't have sufficient fund");
	}

	@Override
	@Transactional(rollbackFor=BankAccountNotFoundException.class)
	public double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException, BankAccountNotFoundException {
		try {
		double newBalance = withdrawForFundTransfer(fromAccount, amount);
		deposit(toAccount,amount);
		return newBalance;
		}catch(LowBalanceException | BankAccountNotFoundException e) {
			logger.error("Exception ",e);
			throw e;
		}
		
	}


}
