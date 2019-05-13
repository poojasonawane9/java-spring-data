package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

public class BankAccountClient {
	
	static final Logger logger = Logger.getLogger(BankAccountClient.class);
	
	public static void main(String[] args) throws BankAccountNotFoundException, LowBalanceException  {
		
		int choice;
		long accountId;
		String accountHolderName;
		String accountType;
		double accountBalance;
		double amount;
		double balance;
		long fromAccount;
		long toAccount;
		
		//BankAccountService bankService = new BankAccountServiceImpl();

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		BankAccountService bankService = context.getBean(BankAccountService.class);
		
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while(true) {
				System.out.println("1. Add New BankAccount\n2. Withdraw\n3. Deposit\n4. Fund Transfer");
				System.out.println("5. Delete BankAccount\n6. Display All BankAccount Details");
				System.out.println("7. Search BankAccount\n8. Check Balance\n9. Update Bank Account Details\n10. Exit\n");
				
				System.out.println("Please enter your choice =");
				choice = Integer.parseInt(reader.readLine());
				
				switch (choice) {
				case 1:
					System.out.println("Enter Acoount Holder Name");
					accountHolderName = reader.readLine();
					System.out.println("Enter Account Type");
					accountType = reader.readLine();
					System.out.println("Enter Account Balance");
					accountBalance = Double.parseDouble(reader.readLine());
					BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
					if (bankService.addNewBankAccount(account))
						System.out.println("Account created successfully...\n");
					else
						System.out.println("failed to create new account...\n");
					break;
				case 2:
						System.out.println("Enter your Account_Id");
						accountId = Long.parseLong(reader.readLine());
						System.out.println("Enter amount you want to withdraw");
						amount =  Double.parseDouble(reader.readLine());
						//balance = bankService.checkBalance(accountId);
						try {
							
						    balance = bankService.withdraw(accountId, amount);
							System.out.println("Your updated balance is " +balance);
						}catch (LowBalanceException | BankAccountNotFoundException e) {
							logger.error("Exception ",e);
							System.out.println(e);
						}
						break;
				
				case 3:
					System.out.println("Enter Account_Id");
					accountId = Long.parseLong(reader.readLine());
					System.out.println("Enter amount you want to deposit");
					amount =  Double.parseDouble(reader.readLine());
					try{
					System.out.println("Your updated balace is "+bankService.deposit(accountId, amount));
					}catch (BankAccountNotFoundException e) {
						logger.error("Exception :",e);
						System.out.println(e);
					}
					break;
					
				case 4:
					System.out.println("Enter your account_id");
					fromAccount = Long.parseLong(reader.readLine());
					System.out.println("Enter amount to transfer");
					amount =  Double.parseDouble(reader.readLine());
					System.out.println("Enter account_id to which you want to transfer fund");
					toAccount = Long.parseLong(reader.readLine());
					
					try {
					System.out.println("Your New balance is "+bankService.fundTransfer(fromAccount, toAccount, amount));
					}catch (BankAccountNotFoundException | LowBalanceException e) {
						logger.error("Exception :",e);
						System.out.println(e);
					}
					break;
				
				case 5:
					System.out.println("Enter your account_id to delete account");
					accountId = Long.parseLong(reader.readLine());
					bankService.deleteBankAccount(accountId);
					System.out.println("account deleted");
					break;
					
				case 6:
					System.out.println("All bank Account Details: "+bankService.findAllBankAccount());
					break;
					
				case 7:
					System.out.println("Enter account_id to search account");
					accountId = Long.parseLong(reader.readLine());
					
					try {
					System.out.println("Details are "+bankService.searchCustomerRecord(accountId));
					}catch(BankAccountNotFoundException e) {
						logger.error("Exception ",e);
						System.out.println(e);
					}
					break;
					
				case 8:
					System.out.println("Enter account_id to check balance");
					accountId = Long.parseLong(reader.readLine());
					try {
					System.out.println("Your balance is "+bankService.checkBalance(accountId));
					}catch(BankAccountNotFoundException e) {
						logger.error("Exception ",e);
						System.out.println(e);
					}
					break;
					
				case 9:
					System.out.println("Enter Account_Id");
					accountId = Long.parseLong(reader.readLine());
					System.out.println("Account present\n"+bankService.searchCustomerRecord(accountId));
					System.out.println("Enter your name to update");
					accountHolderName = reader.readLine();
					System.out.println("Enter updated Account Type");
					accountType = reader.readLine();
					if (bankService.updateBankAccountDetails(accountId, accountHolderName, accountType))
						System.out.println("Account updated successfully...\n");
					else
						System.out.println("failed to update details...\n");
					break;
					
				case 10:
					System.out.println("Thanks for banking with us.");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
