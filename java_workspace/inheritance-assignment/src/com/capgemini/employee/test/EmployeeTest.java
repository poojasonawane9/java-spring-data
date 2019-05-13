package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;

public class EmployeeTest {

	private Employee employee;
	
	@Before
	public void setUp() {
		employee = new Employee(101,"John",20000,5000);
	}
	
	@Test
	public void testEmployeeObjectCreated() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	
	@Test
	public void testEmployeeObjectCreatedWithParameterizedConstructor() {
		assertEquals(101, employee.getEmployeeId());
		assertEquals("John", employee.getEmployeeName());
		assertEquals(20000, employee.getBasicSalary());
		assertEquals(5000, employee.getMedical());
	}
	
	@Test
	public void testCalculateGrossSalary() {
		employee.calculateGrossSalary();
		assertEquals(35000, employee.getGrossSalary());
	}
	
	@Test
	public void testCalculateNetSalary() {
		employee.calculateGrossSalary();
		employee.calculateNetSalary();
		assertEquals(32400, employee.getNetSalary());
	}

}
