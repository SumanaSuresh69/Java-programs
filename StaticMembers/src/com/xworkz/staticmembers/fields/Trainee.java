package com.xworkz.staticmembers.fields;

public class Trainee {
	int id;
	String name;
	String emailId;
	static String institution = "X-Workz";
	int age;

	Trainee() {
		System.out.println("no-arg constructor");
	}

	Trainee(int inId, String inName, String inEmailId, int inAge) {
		id = inId;
		name = inName;
		emailId = inEmailId;
		age = inAge;
	}

	void displayDetails() {
		System.out.println("Id: " + id + " Name: " + name + " EmailId: " + emailId + " Institution: " + institution
				+ " Age: " + age);
	}
}