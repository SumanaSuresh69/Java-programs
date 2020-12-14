package com.xworkz.accessmodifier.defaultmodifier;

 class LaptopTester {

	public static void main(String[] args) {
		Laptop laptop = new Laptop("HP", 35000.00);
		laptop.brand = "Dell";
		laptop.price = 40000.00;
		laptop.coding();
		laptop.playingVideo();
	}

}
