package com.xworkz.inheritance.multilevel;

public class ComputerTester {

	public static void main(String[] args) {
		TouchScreenLaptop hpLaptop = new TouchScreenLaptop();
		hpLaptop.color = "Black";
		hpLaptop.cost = 50000.00;
		hpLaptop.batteryVoltage = 10.8;
		hpLaptop.hasCharger = true;
		hpLaptop.hasTouchScreen = true;

		System.out.println("Features of HP Laptop are: ");
		System.out.println("Color: " + hpLaptop.color);
		System.out.println("Cost: " + hpLaptop.cost);
		System.out.println("Battery Voltage: " + hpLaptop.batteryVoltage);
		System.out.println("Has Charger: " + hpLaptop.hasCharger);
		System.out.println("Has Touch Screen: " + hpLaptop.hasTouchScreen);

		hpLaptop.gaming();
		hpLaptop.working();
		hpLaptop.movable();
		hpLaptop.canBehaveLikeTablet();

	}

}
