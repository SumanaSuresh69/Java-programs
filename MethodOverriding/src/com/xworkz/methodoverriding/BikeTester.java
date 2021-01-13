package com.xworkz.methodoverriding;

public abstract class BikeTester {

	public static void main(String[] args) {
		MopedBike activa = new MopedBike("Blue", "Honda Activa", 80000.00, true);
		activa.speedlimit();

	}

}
