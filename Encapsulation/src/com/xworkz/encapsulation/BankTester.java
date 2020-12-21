package com.xworkz.encapsulation;

public class BankTester {

	public static void main(String[] args) {
		
		Bank kotakacct = new Bank("1436786", "Sumana", "Malavalli");
		
		//kotakacct.balance = 1000000;
		
		kotakacct.withdraw(-1000000.00);

		kotakacct.miniStatement();

	}

}
