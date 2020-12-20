package com.xworkz.staticmembers.fields;

public class TraineeTester {

	public static void main(String[] args) {
		Trainee sumana = new Trainee(1, "Sumana", "sumana@gmail.com", 22);
		sumana.displayDetails();
		
		Trainee supriya = new Trainee(2, "Supriya", "supriya@gmail.com", 28);
		supriya.displayDetails();
		
		Trainee sunitha = new Trainee(3, "Sunitha", "sunitha@gmail.com", 32);
		sunitha.displayDetails();
		
		Trainee suresh = new Trainee(4, "Suresh", "suresh@gmail.com", 45);
		suresh.displayDetails();
	}

}
