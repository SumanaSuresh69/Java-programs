package com.xworkz.staticmembers.methods;

public class TraineeMethodTester {

	public static void main(String[] args) {
		TraineeMethod sumana = new TraineeMethod(1, "Sumana", "sumana@gmail.com", 22);
		TraineeMethod.setInstitution("X-Workz");
		sumana.displayDetails();

		TraineeMethod supriya = new TraineeMethod(2, "Supriya", "supriya@gmail.com", 28);
		supriya.displayDetails();

		TraineeMethod sunitha = new TraineeMethod(3, "Sunitha", "sunitha@gmail.com", 32);
		sunitha.displayDetails();

		TraineeMethod suresh = new TraineeMethod(4, "Suresh", "suresh@gmail.com", 45);
		suresh.displayDetails();

	}

}
