package com.xworkz.exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("Program begin");
		try {
			String str = args[0];//IndexOutOfBound
			System.out.println("Input is: " + str);
			try {
				int a = Integer.parseInt(str);
				System.out.println("The number entered is: " + a);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception occured, Please enter value to proceed");
			}
			System.out.println("end of first try block");
		} catch (NumberFormatException e) {
			System.out.println("Exception occured, Please enter a numeric value");
		}
		System.out.println("End of the program");

	}

}
