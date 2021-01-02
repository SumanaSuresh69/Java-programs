package com.xworkz.arrays.customobjectarray;

public class CakeTester {

	public static void main(String[] args) {
		Cake chacolate = new Cake("Brown", "Large", 400.00);
		Cake vanilla = new Cake("White", "small", 200.00);
		Cake straberry = new Cake("Pink", "Medium", 300.00);
		Cake redvelvet = new Cake("Red", "Large", 600.00);

		Cake[] cakeArray = new Cake[6];
		cakeArray[0] = chacolate;
		cakeArray[2] = vanilla;
		cakeArray[4] = straberry;
		cakeArray[5] = redvelvet;
		
		Cake tempcake=cakeArray[0];
		System.out.println("Values in first element: ");
		tempcake.displayCake();


		System.out.println("Elements are: ");
		for (int i = 0; i < cakeArray.length; i++) {
			Cake temp=cakeArray[i];
			if(temp!=null)
				temp.displayCake();
			else
			System.out.println("null");
		}

	}

}
