package com.xworkz.exceptionhandling;

public class MoreThanOneExceptionEx {

	public static void main(String[] args) {
		int a = 10, b = 0;
		String name = "sumana";

		try {
			int leng = name.length();
			System.out.println("length is: " + leng);

			int result = a / b;
			;
			System.out.println("division of a and b is: " + result);

		} catch (NullPointerException e) {
			System.out.println("string can't be null");
		} catch (ArithmeticException e) {
			System.out.println("Divisor can't be null");
		} catch (Exception e) {
			System.out.println("some exception occured");
		}
		System.out.println("end of program");
	}

}
