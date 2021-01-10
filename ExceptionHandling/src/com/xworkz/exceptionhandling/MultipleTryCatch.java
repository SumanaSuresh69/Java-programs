package com.xworkz.exceptionhandling;

public class MultipleTryCatch {
	public static void main(String[] args) {
		System.out.println("Program begin");
		String name = null;
		try {
			System.out.println("Begin of first try block");
			
			String str = "10";//IndexOutOfBound
			System.out.println("Input is: " + str);
			try {
				int a = Integer.parseInt(str);
				System.out.println("The number entered is: " + a);
				
				try {
					System.out.println("inside 3rd try block");
					name.length();// NullPointerException which is not handled

					int div = 10 / 0;
					System.out.println("end of 3rd try catch block");
				} catch (ArithmeticException e) {
					System.out.println("ArithmeticException occured");
				}
				System.out.println("end of 2nd try catch block");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception occured, Please enter value to proceed");
			}
			//important statements to be executed
			System.out.println("end of first try block");
		} catch (NumberFormatException e) {
			System.out.println("Exception occured, Please enter a numeric value");
		}
		System.out.println("End of the program");

	}

}
