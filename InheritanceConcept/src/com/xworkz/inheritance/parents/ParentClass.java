package com.xworkz.inheritance.parents;

public class ParentClass {
	
	double tallHeight;
	int longNose;
	int longFoot; 

	void character() {
		System.out.println("Independent");
	}
	void cooking() {
		System.out.println("Cooking food");
	}
	void earing() {
		System.out.println("Earning money");
	}
	
	void displayDetails() {
		System.out.println("Tall height: " + tallHeight + " Long nose: " + longNose + " Long foot: " + longFoot);
	}
}
