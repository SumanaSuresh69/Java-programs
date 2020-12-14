package com.xworkz.accessmodifier.defaultmodifier;

class Laptop {
	String brand;
	double price;

	Laptop(String inBrand, double inPrice) {
		brand = inBrand;
		price = inPrice;
	}

	void playingVideo() {
		System.out.println("playing video");
	}

	void coding() {
		System.out.println("writing and execution java code");
	}
}
