package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;



public class MarketingExecutiveTest {
	
private MarketingExecutive marketingexecutive;
	
	@BeforeEach
	public void setUp() {
	 marketingexecutive = new MarketingExecutive(101,"John",20000,5000,125);
	}
	@Test
	public void testMarketingExecutiveObjectCreated() {
		MarketingExecutive marketingexecutive = new MarketingExecutive();
		assertNotNull(marketingexecutive);
	}
	

	@Test
	public void testManagerGrossSalary() {
		assertEquals(37250,marketingexecutive.calculateGrossSalary(),0.02);
	}
	
	@Test
	public void testManagerNetSalary() {
		marketingexecutive.calculateGrossSalary();
		assertEquals(32400,marketingexecutive.calculateNetSalary(),0.02);
	}
	}


