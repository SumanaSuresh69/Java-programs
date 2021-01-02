package com.xworkz.arrays.customobjectarray;

public class FlowerTester {

	public static void main(String[] args) {
		Flower sunFlower = new Flower("Yellow", "Large", 50.00);
		Flower jasmine = new Flower("White", "small", 40.00);
		Flower marigold = new Flower("Orange", "Medium", 100.00);

		Flower[] flowersArray = new Flower[4];
		flowersArray[0] = sunFlower;
		flowersArray[2] = jasmine;
		flowersArray[3] = marigold;
		
		Flower tempflower=flowersArray[0];
		System.out.println("Values in first element: ");
		tempflower.displayFlower();


		System.out.println("All the elements are: ");
		for (int i = 0; i < flowersArray.length; i++) {
			Flower temp=flowersArray[i];
			if(temp!=null)
				temp.displayFlower();
			else
			    System.out.println("null");
		}

	}

}
