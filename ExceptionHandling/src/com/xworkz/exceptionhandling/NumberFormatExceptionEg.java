package com.xworkz.exceptionhandling;

public class NumberFormatExceptionEg {

	public static void main(String[] args) {
		System.out.println("Program Begin");
		String str = "Sumana";

		System.out.println("Input is: " + str);
		try {
			int a = Integer.parseInt(str);
			System.out.println("The number entered is: " + a);
		} catch (NumberFormatException e) {
			System.out.println("Exception occured, Please enter a numeric value");
		}
		System.out.println("End of the program");

	}

}
