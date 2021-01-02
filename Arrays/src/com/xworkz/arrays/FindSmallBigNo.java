package com.xworkz.arrays;

public class FindSmallBigNo {

	public static void main(String[] args) {
		int num[] = new int[] { 33, 53, 73, 94, 22, 45, 23, 87, 13, 63 };
		int smallest = num[0];
		int biggest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > biggest)
				biggest = num[i];
			else if (num[i] < smallest)
				smallest = num[i];

		}
		System.out.println("Largest number is: " + biggest);
		System.out.println("Smallest number is: " + smallest);

	}

}

//Largest number is: 94
//smallest number is: 13