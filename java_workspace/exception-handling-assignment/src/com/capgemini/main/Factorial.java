package com.capgemini.main;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class Factorial {
	private int number;
	
	public Factorial(int number) {
		this.number = number;
	}
	
	public void getFactorialOfNumber() throws InvalidInputException, FactorialException {
		if(number < 2) {
			System.out.println("Number is greater than 2");
		}
		else
			throw new InvalidInputException("Number is less than two");
		int factorial = 1;
		for(int i = 1;i <= number;i++) {
			factorial *= i;
		}
		if(factorial < Integer.MAX_VALUE) {
			System.out.println("within range");
		}
		else {
			throw new  FactorialException("Not within range");
		}
		
	}

	
}
