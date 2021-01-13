package com.xworkz.methodoverriding;

public class Bike {
	String color;
	String brand;
	double price;

	public Bike(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	void speedlimit() {
		System.out.println("Default speed limit: 120");
	}

	void applybreak() {
		System.out.println("Default breaking system");
	}

}
