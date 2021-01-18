package com.xworkz.abstraction.interfaceconcept;

public class Classroom implements CollegeWifi {

	@Override
	public void turnon() {
		System.out.println("wifi available at class room");

	}

	@Override
	public void turnoff() {
		System.out.println("wifi not available at class room");

	}

}
