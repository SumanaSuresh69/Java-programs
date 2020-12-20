package com.xworkz.staticmembers.methods;

public class TraineeMethod {
	int id;
	String name;
	String emailId;
	static String institution = "X-Workz";
	int age;

	static void setInstitution(String institutionNmae) {
		institution = "X-Workz";
	}

	TraineeMethod() {
		System.out.println("no-arg constructor");
	}

	TraineeMethod(int inId, String inName, String inEmailId, int inAge) {
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
