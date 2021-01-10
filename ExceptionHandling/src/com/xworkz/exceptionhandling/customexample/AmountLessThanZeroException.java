package com.xworkz.exceptionhandling.customexample;

public class AmountLessThanZeroException extends RuntimeException {
	public AmountLessThanZeroException() {
		super("Amount must be greater thanzero");
	}

}
