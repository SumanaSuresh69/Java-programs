package com.xworkz.arrays.customobjectarray;

public class Flower {
	String color;
	String size;
	double cost;

	public Flower(String incolor, String insize, double incost) {
		color = incolor;
		size = insize;
		cost = incost;
	}

	void displayFlower() {
		System.out.println("Color: " + color + " Size: " + size + " Cost: " + cost);
	}

}
