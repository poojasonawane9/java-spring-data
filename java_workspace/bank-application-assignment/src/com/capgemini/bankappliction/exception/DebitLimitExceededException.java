package com.capgemini.bankappliction.exception;

public class DebitLimitExceededException extends Exception {

	public DebitLimitExceededException(String message) {
		super(message);
	}
}
