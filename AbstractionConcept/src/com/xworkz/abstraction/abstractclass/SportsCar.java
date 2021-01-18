package com.xworkz.abstraction.abstractclass;

public class SportsCar extends Car {

	@Override
	void accelarator() {
		System.out.println("Accelerator from sports Car");

	}

	@Override
	void applyBreak() {
		System.out.println("Good breaking system from sports Car");

	}

	@Override
	void applyClutch() {
		System.out.println("Clutch from sports bike");

	}

}
