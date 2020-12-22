package com.xworkz.inheritance.multilevel;

public class CarTester {

	public static void main(String[] args) {
		NewHyundaiI20 car = new NewHyundaiI20();
		car.color = "Red";
		car.cost = 700000.00;
		car.hasTopRoof = true;
		car.moreMileage = 20.35;
		car.speedInKmph = 70;

		System.out.println("color: " + car.color);
		System.out.println("cost: " + car.cost);
		System.out.println("Has top roof: " + car.hasTopRoof);
		System.out.println("More mileage: " + car.moreMileage);
		System.out.println("Speed In Kmph: " + car.speedInKmph);

		car.driving();
		car.transportation();
		car.antiLockBrakingSystem();
		car.multiFunctionSteeringWheel();
		car.engineStartStopBotton();
		car.airPurifier();
	}

}
