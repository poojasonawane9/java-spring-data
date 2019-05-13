package com.capgemini.newspaper.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=1,urlPatterns= {"/getNews"})
public class NewsPaperDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewsPaperDetails() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path = request.getParameter("paper");
		
		if(path.equals("toi")) {
			response.sendRedirect("https://timesofindia.indiatimes.com/");
		}
		else if (path.equals("et")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");
		}
		else if(path.equals("mt")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
		}
		else if(path.equals("dna")) {
			response.sendRedirect("https://www.dnaindia.com/");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
