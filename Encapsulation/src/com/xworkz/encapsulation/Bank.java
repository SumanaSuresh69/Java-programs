package com.xworkz.encapsulation;

public class Bank {
	public String acctNum;// data members
	private double balance;
	public String name;
	public String branch;

	public Bank(String inacctNum, String inname, String inbranch) {
		acctNum = inacctNum;
		balance = 1000.00;
		name = inname;
		branch = inbranch;
	}

	public void withdraw(double amount) {
		System.out.println("withdrawal of amount: " + amount);

		if (amount > 0 && balance > amount)
			balance -= amount;
		else
			System.out.println("Enter amount morethan 0");
	}
	
	public void deposit(double amount) {
		if(amount > 0)
			balance += amount;
	}

	public void miniStatement() {
		System.out.println("For AcctNum: " + acctNum + " Balance is: " + balance);
	}
}
