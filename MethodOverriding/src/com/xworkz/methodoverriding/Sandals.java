package com.xworkz.methodoverriding;

public class Sandals {
	String color;
	String brand;
	double price;

	public Sandals(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	void walking() {
		System.out.println("walking on road");
	}

}
