package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;
import com.capgemini.main.Factorial;

public class FactorialTest {

	@Test(expected=InvalidInputException.class)
	public void testFactorialOfNumberIsLessThanTwo() throws InvalidInputException, FactorialException {
		Factorial factorial = new Factorial(5);
		factorial.getFactorialOfNumber();
	}
}
