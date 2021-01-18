package com.xworkz.abstraction.abstractclass;

public class CarTester {

	public static void main(String[] args) {
		Car jaguar = new SportsCar();
		jaguar.accelarator();
		jaguar.applyBreak();
		jaguar.applyClutch();
		jaguar.drivingCar();

	}

}
