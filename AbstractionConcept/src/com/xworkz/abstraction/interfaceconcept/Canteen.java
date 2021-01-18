package com.xworkz.abstraction.interfaceconcept;

public class Canteen implements CollegeWifi {

	@Override
	public void turnon() {
		System.out.println("wifi available at Canteen");

	}

	@Override
	public void turnoff() {
		System.out.println("wifi not available at Canteen");

	}

}
