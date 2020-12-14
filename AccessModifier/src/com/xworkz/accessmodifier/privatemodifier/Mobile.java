package com.xworkz.accessmodifier.privatemodifier;

class Mobile {
	private String brand;
	private String color;

	private Mobile(String inBrand, String inColor) {
		brand = inBrand;
		color = inColor;
	}

	void playingGames() {
		System.out.println("Playing games");
	}

	void messaging() {
		System.out.println("Message to someone");
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung", "Black");
		mobile.brand = "Vivo";
		mobile.color = "White";
		mobile.messaging();
		mobile.playingGames();

	}
}
