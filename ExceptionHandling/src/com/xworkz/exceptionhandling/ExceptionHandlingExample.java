package com.xworkz.exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		System.out.println("Program to illustrate exception handling");
		String name = null;
		try {
			int leng = name.length();
			System.out.println("length is: " + leng);
		} catch (Exception e) {
			System.out.println("string can't be null to find length");
		}
		System.out.println("Something important");
		System.out.println("program ends normally");

	}

}
