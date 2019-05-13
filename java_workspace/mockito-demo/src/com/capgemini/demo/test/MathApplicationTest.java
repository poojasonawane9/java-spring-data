package com.capgemini.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.demo.MathApplication;
import com.capgemini.demo.exception.InvalidInputException;
import com.capgemini.demo.service.CalculatorService;

public class MathApplicationTest {

	@Mock
	private CalculatorService service;

	@InjectMocks
	MathApplication application = new MathApplication(service);
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testPerformAdditionWithTwoPositiveIntegers() {
		when(service.addition(6, 4)).thenReturn(10);
		assertEquals(10, application.performAddition(6,4));
	}
	
	@Test
	public void testPerformAdditionWithOneNegativeOnePositiveIntegers() {
		when(service.addition(-6, 4)).thenReturn(-2);
		assertEquals(-2, application.performAddition(-6,4));
	}
	
	@Test
	public void testPerformAdditionWithOnePositiveOneNegativeIntegers() {
		when(service.addition(6, -4)).thenReturn(2);
		assertEquals(2, application.performAddition(6,-4));
	}
	
	@Test
	public void testPerformSubstractionWithTwoPositiveIntegers() {
		when(service.subtraction(6, 3)).thenReturn(3);
		assertEquals(3, application.performSubtraction(6, 3));
	}
	
	@Test
	public void testPerformSubstractionWithOneNegativeOnePositiveIntegers() {
		when(service.subtraction(-6, 4)).thenReturn(-10);
		assertEquals(-10, application.performSubtraction(-6,4));
	}
	
	@Test
	public void testPerformSubstractionWithOnePositiveOneNegativeIntegers() {
		when(service.subtraction(6, -4)).thenReturn(10);
		assertEquals(10, application.performSubtraction(6,-4));
	}
	
	@Test
	public void testPerformMultiplicationWithTwoPositiveIntegers() {
		when(service.multiplication(6, 4)).thenReturn(24);
		assertEquals(24, application.performMultipication(6, 4));
	}
	
	@Test
	public void testPerformMultiplicationWithOneNegativeOnePositiveIntegers() {
		when(service.multiplication(-6, 4)).thenReturn(-24);
		assertEquals(-24, application.performMultipication(-6,4));
	}
	
	@Test
	public void testPerformMultiplicationWithOnePositiveOneNegativeIntegers() {
		when(service.multiplication(6, -4)).thenReturn(-24);
		assertEquals(-24, application.performMultipication(6,-4));
	}
	
	@Test
	public void testPerformDivisionWithTwoPositiveIntegers() {
		when(service.division(10, 5)).thenReturn(2);
		assertEquals(2, application.performDivision(10, 5));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testPerformDivisionWithDivisorZero() {
		doThrow(new ArithmeticException("/ by zero")).when(service).division(10, 0);
		application.performDivision(10, 0);
	}
	
	@Test
	public void testToFindFactorialOfPositiveNumber() throws InvalidInputException {
		when(service.factorial(5)).thenReturn(120L);
		assertEquals(120L, application.findFactorial(5));
	}
	
	@Test(expected=InvalidInputException.class)
	public void testToFindFactorialOfNegativeNumber() throws InvalidInputException {
		doThrow(new InvalidInputException("Invalid Input")).when(service).factorial(-2);
		application.findFactorial(-2);
	}
	
	@Test
	public void testToFindFactorialOfOne() throws InvalidInputException {
		when(service.factorial(0)).thenReturn(1L);
		assertEquals(1L, application.findFactorial(0));
	}
	
	@Test
	public void testToFindSquareOfPositiveNumber() {
		when(service.square(4)).thenReturn(16L);
		assertEquals(16, application.findSquare(4));
	}
	
	@Test
	public void testToFindSquareOfNegativeNumber() {
		when(service.square(-3)).thenReturn(9L);
		assertEquals(9, application.findSquare(-3));
	}
	
}
