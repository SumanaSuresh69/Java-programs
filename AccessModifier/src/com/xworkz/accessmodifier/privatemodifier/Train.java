package com.xworkz.accessmodifier.privatemodifier;

public class Train {
	private String name;
	private String type;

	private Train(String inName, String inType) {
		name = inName;
		type = inType;
	}

	void speedOfTrain(int speed) {
		System.out.println("Running at the speed in kmph " + speed);
	}

	public static void main(String[] args) {
		Train train = new Train("Sathabdi", "Diesel");
		train.name = "Passenger";
		train.type = "Diesel";
		train.speedOfTrain(100);
	}
}
