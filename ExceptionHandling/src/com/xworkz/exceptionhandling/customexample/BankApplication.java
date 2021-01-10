package com.xworkz.exceptionhandling.customexample;

public class BankApplication {
	double balance = 10000;

	void withdraw(int amount) throws AmountLessThanZeroException {
		if (amount > 0) {
			balance -= amount;
		} else {
			throw new AmountLessThanZeroException();
		}

	}
}