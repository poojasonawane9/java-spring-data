package com.capgemini.bankapp.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ha.backend.Sender;
import org.apache.log4j.Logger;

import com.capgemini.bankapp.exception.BankAccountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

@WebServlet(urlPatterns= {"*.do"},loadOnStartup = 1)
public class BankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BankAccountService bankService;
	static final Logger logger = Logger.getLogger(BankAccountController.class);
	
    public BankAccountController() {
        bankService = new BankAccountServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path = request.getServletPath();
		
		if(path.equals("/Display Details.do")) {
			List<BankAccount> bankAccounts = bankService.findAllBankAccount();
			RequestDispatcher dispatcher = request.getRequestDispatcher("Display Details.jsp");
			
			request.setAttribute("accounts", bankAccounts);
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String path = request.getServletPath();                  // gives you login.do path
		System.out.println(path);
		
		if(path.equals("/addNewBankAccount.do")) {
			String accountHolderName = request.getParameter("account_holder_name");
			String accountType = request.getParameter("account_type");
			double balance = Double.parseDouble(request.getParameter("account_balance")); 
			
			BankAccount account = new BankAccount(accountHolderName,accountType,balance);
			if(bankService.addNewBankAccount(account)) {
				out.println("<h2>Bank Account Created..</h2>");
				out.close();
			}
		}
		
		if(path.equals("/deleteAccount.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			
			try {
				if(bankService.deleteBankAccount(accountId)) {
					out.println("<h2>Bank Account Deleted..</h2>");
					out.close();
				}
			} catch (BankAccountNotFoundException e) {
				out.println("<h2>Account is not found.....<h2>");
				logger.error("Exception",e);
			}
		}
		
		if(path.equals("/withdrawAmount.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			double balance = Double.parseDouble(request.getParameter("account_balance")); 
			
			try{
				double amount = bankService.withdraw(accountId, balance);
				out.println("<h2>You Balance is " +amount+ "</h2>");	
			}catch(BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);
				
			} catch (LowBalanceException e) {
				out.println("<h2>You don't have Sufficient Balance...</h2>");
				logger.error(e);
			}
		}
		
		if(path.equals("/depositAmount.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			double amount = Double.parseDouble(request.getParameter("amount"));
			
			try {
				double amountToDeposit = bankService.deposit(accountId, amount);
				out.println("<h2>You Remaining Balance is " +amountToDeposit+ "</h2>");
			}catch (BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);
			}
		}
		
		if(path.equals("/checkBalance.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			
			try {
				double checkbalance = bankService.checkBalance(accountId);
				out.println("<h2>Your Balance is " +checkbalance+ "</h2>");
			}catch (BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);
			}
		}
		
		if(path.equals("/fundTransfer.do")) {
			long fromAccountId = Long.parseLong(request.getParameter("fromAccount"));
			long toAccountId = Long.parseLong(request.getParameter("toAccount"));
			double amount = Double.parseDouble(request.getParameter("amount"));
			
			try {
				double remainingAmount = bankService.fundTransfer(fromAccountId,toAccountId,amount);
				out.println("<h2>You Remaining Balance is " +remainingAmount+ "</h2>");
			}catch (BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);
			} catch (LowBalanceException e) {
				out.println("Don't have Sufficient balance..");
				logger.error(e);
			}
		}
		
		if(path.equals("/Search Account.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			
			
			try {
				BankAccount account = bankService.searchCustomerRecord(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("ShowSearchResult.jsp");
				request.setAttribute("accounts", account);
				dispatcher.forward(request, response);
				
			}catch(BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);
			}
			
		}
		
		if(path.equals("/Details.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			String accountHolderName = request.getParameter("account_holder_name");
			String accountType = request.getParameter("account_type");
			BankAccount account;
		
			try {
				account = bankService.searchCustomerRecord(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateDetails.jsp");
				request.setAttribute("accounts", account);
				dispatcher.forward(request, response);
				
			} catch (BankAccountNotFoundException e) {
				out.println("Bank Account not found..");
				logger.error(e);		
			}
		}
		
		if(path.equals("/UpdateDetails.do")) {
			long accountId = Long.parseLong(request.getParameter("account_id"));
			String accountHolderName = request.getParameter("account_holder_name");
			String accountType = request.getParameter("account_type");
		
		
		boolean account = bankService.updateBankAccountDetails(accountId, accountHolderName, accountType);
		if(account) {
			response.sendRedirect("Display Details.do");
		}
		
		
		}
	}
}

