package com.xworkz.methodoverriding;

public class MopedBike extends Bike {
	boolean gearless;

	public MopedBike(String color, String brand, double price, boolean gearless) {
		super(color, brand, price);
		this.gearless = gearless;
	}

	@Override
	void speedlimit() {
		System.out.println("Default speed limit of moped bikes: 80");
	}

}
