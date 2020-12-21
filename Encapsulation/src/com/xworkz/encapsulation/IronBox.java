package com.xworkz.encapsulation;

public class IronBox {
	String color;
	private String brand;
	int sizeInInches;
	private int powerRating;

	public IronBox(String inColor, int inSize) {
		color = inColor;
		brand = "Philips";
		sizeInInches = inSize;
		powerRating = 4;
	}

	String getBrand() {// read
		return brand;
	}

	// Not written setter method because no permission to write brand
	int getPowerRating() {
		return powerRating;
	}

	protected void setPowerRating(int inpowerRating) {//write
		powerRating = inpowerRating;
	}

}
