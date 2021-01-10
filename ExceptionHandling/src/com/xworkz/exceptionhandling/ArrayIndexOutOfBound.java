package com.xworkz.exceptionhandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[0] = 4;
			arr[1] = 9;
			arr[2] = 15;
			arr[3] = 20;
			arr[4] = 25;
			arr[5] = 30;//error occurs
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}

	}

}
