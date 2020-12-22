package com.xworkz.inheritance.heirarchial;

public class EmployeeTester {

	public static void main(String[] args) {
		PermanentEmp p = new PermanentEmp();
		TemporaryEmp t = new TemporaryEmp();

		p.incrementSalary();
		p.displaySalary();
		t.incrementSalary();
		t.displaySalary();
	}
}
