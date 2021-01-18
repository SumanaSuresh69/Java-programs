package com.xworkz.abstraction.abstractclass;

public class BikeTester {

	public static void main(String[] args) {
		Bike yamaha = new SportsBike(); // upcasting
		yamaha.accelarator();
		yamaha.applyBreak();
		yamaha.ridingBike();
	}

}
