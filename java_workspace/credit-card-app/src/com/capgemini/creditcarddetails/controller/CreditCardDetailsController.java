package com.capgemini.creditcarddetails.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=1,urlPatterns= {"/creditCardDetails"})
public class CreditCardDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreditCardDetailsController() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		String path = request.getServletPath();
		
		PrintWriter out = response.getWriter();
		
		if(path.equals("/creditCardDetails")) {
			
			String accountHolderName = request.getParameter("credit_card_holder_number");
			long creditCardNumber = Long.parseLong(request.getParameter("credit_card_number"));
			String expiryDate =request.getParameter("expiry_date");
			int cvv = Integer.parseInt(request.getParameter("cvv"));
			
			
			
			out.println("Your Account Holder Name is "+accountHolderName+"<br>");
			out.println("Your Credit Card Number is "+creditCardNumber+"<br>");
			out.println("Your Card Expiry Date  is "+expiryDate+"<br>");
			out.println("Your CVV number is "+cvv);
			
		}
	}
	
}
