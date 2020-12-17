package com.xworkz.blocks;

public class Pen {
	String color;
	String brand;
	boolean isRefill;
	double price;
	{
		System.out.println("Initialization block 1");
		color = "blue";
		brand = "Renolds";
	}
	Pen(){
		System.out.println("No-arg constructor");
	}
	{
		System.out.println("Initialization block 2");
		isRefill = true;
	}
	Pen(String inColor, String inBrand, double inPrice){
		System.out.println("Parameterized constructor");
		color = inColor;
		brand = inBrand;
		price = inPrice;
	}
	{
		System.out.println("Initialization block 3");
		price = 20.00;
	}

}
