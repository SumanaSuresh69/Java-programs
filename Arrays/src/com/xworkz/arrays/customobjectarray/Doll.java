package com.xworkz.arrays.customobjectarray;

public class Doll {
	String color;
	String size;
	double cost;

	public Doll(String incolor, String insize, double incost) {
		color = incolor;
		size = insize;
		cost = incost;
	}

	void displayDoll() {
		System.out.println("Color: " + color + " Size: " + size + " Cost: " + cost);
	}

}
