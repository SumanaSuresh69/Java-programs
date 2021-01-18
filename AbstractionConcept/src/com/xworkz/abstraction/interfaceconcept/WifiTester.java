package com.xworkz.abstraction.interfaceconcept;

public class WifiTester {

	public static void main(String[] args) {
		CollegeWifi room = new Classroom();
		room.turnon();
		room.turnoff();

		CollegeWifi canteen = new Canteen();
		canteen.turnon();
		canteen.turnoff();

	}

}
