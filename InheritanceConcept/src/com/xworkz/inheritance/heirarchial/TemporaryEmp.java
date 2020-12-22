package com.xworkz.inheritance.heirarchial;

public class TemporaryEmp extends Employee {
	double hike = 0.35;

	void incrementSalary() {
		System.out.println("The temporary employee incremented salary is: " + (salary + (salary * hike)));
	}
}
