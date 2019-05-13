package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;

class ManagerTest {
	private Manager manager;
	
	@BeforeEach
	public void setUp() {
	 manager = new Manager(101,"John",20000,5000);
	}

	@Test
	public void testMangerObjectCreated() {
		Manager manager = new Manager();
		assertNotNull(manager);
	}
	
	@Test
	public void testManagerObjectCreatedWithParameterizedConstructor() {
		Manager manager = new Manager(101,"John",20000,5000);
		assertNotNull(manager);
		assertEquals(101, manager.getEmployeeId());
		assertEquals("John", manager.getEmployeeName());
		assertEquals(20000, manager.getBasicSalary());
		assertEquals(5000, manager.getMedical());
	}
	
	@Test
	public void testManagerGrossSalary() {
		manager.calculateGrossSalary();
		assertEquals(39800,manager.calculateGrossSalary(),0.02);
	}
	
	@Test
	public void testManagerNetSalary() {
		manager.calculateGrossSalary();
		assertEquals(37200,manager.calculateNetSalary(),0.02);
	}
	
}
