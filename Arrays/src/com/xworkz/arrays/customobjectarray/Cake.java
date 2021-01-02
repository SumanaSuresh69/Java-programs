package com.xworkz.arrays.customobjectarray;

public class Cake {
	String flavor;
	String size;
	double cost;

	public Cake(String inflavor, String insize, double incost) {
		flavor = inflavor;
		size = insize;
		cost = incost;
	}

	void displayCake() {
		System.out.println("Flavor: " + flavor + " Size: " + size + " Cost: " + cost);

	}
}
