package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.util.DbUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import com.capgemini.bankapp.rowmapper.*;
import org.springframework.transaction.annotation.*;

@Transactional
public class BankAccountDaoImpl implements BankAccountDao {

	private JdbcTemplate jdbcTemplate;
	
	 public BankAccountDaoImpl(JdbcTemplate jdbcTemplate) {
        	this.jdbcTemplate = jdbcTemplate;
    	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		String query = "INSERT INTO bankaccounts (customer_name,account_type,account_balance) VALUES('"+account.getAccountHolderName()+"','"+account.getAccountType()+"','"+account.getAccountBalance()+"')";
		int result = jdbcTemplate.update(query);
		if(result==1)
			return true;
		else
			return false;	
		
	}

	@Override
	public boolean deleteAccount(long accountId) {
		String query = "DELETE FROM bankaccounts WHERE account_id ="+accountId;
		int result = jdbcTemplate.update(query);
		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateBankAccountDetails(long accountId,String accountHolderName,String accountType) {
		String query = "UPDATE bankaccounts SET customer_name = ?,account_Type = ? WHERE account_id = "+accountId;
		int result = jdbcTemplate.update(query,new Object[] {accountHolderName,accountType});
      		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public BankAccount searchCustomerRecord(long accountId) throws BankAccountNotFoundException {
		String query = "SELECT * FROM bankaccounts WHERE account_id = ?";
		BankAccount account = null;
		try{
			account = jdbcTemplate.queryForObject(query,new Object[] {accountId},new BankAccountRowMapper());
		}catch(Exception e){
			throw new BankAccountNotFoundException("Bank Account not found.....");
		}
		return account;
	}

	@Override
	public List<BankAccount> findAllbankAccounts() {

		List<BankAccount> bankAccount = jdbcTemplate.query("SELECT * FROM bankaccounts",new BankAccountRowMapper());
		return bankAccount;		
	}

	@Override
	public double getBalance(long accountId)throws BankAccountNotFoundException {
		String query = "SELECT account_balance FROM bankaccounts WHERE account_id =?";
		double balance = -1;
		try{
			balance = jdbcTemplate.queryForObject(query,new Object[] {accountId},Double.class);
		}catch(Exception e){
			throw new BankAccountNotFoundException("BankAccount not Found....");
		}
		return balance;	
		
	}
	

	@Override
	public void updateBalance(long accountId, double newBalance) {

		String query =  "UPDATE bankaccounts SET account_balance='"+newBalance+"' WHERE account_id='"+accountId+"' ";
		jdbcTemplate.update(query);
		
		
	}

}
