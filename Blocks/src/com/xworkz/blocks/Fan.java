package com.xworkz.blocks;

public class Fan {
	String color;
	String brand;
	double price;
	{
		System.out.println("Initialization block 1");
		color = "White";
		brand = "Bajaj";
	}

	Fan() {
		System.out.println("No-arg constructor");
	}

	{
		System.out.println("Initialization block 2");
	}

	Fan(String inColor, String inBrand, double inPrice) {
		System.out.println("Parameterized constructor");
		color = inColor;
		brand = inBrand;
		price = inPrice;
	}

	{
		System.out.println("Initialization block 3");
		price = 5000.00;
	}
	{
		System.out.println("Initialization block 4");
	}

}
