package com.xworkz.exceptionhandling;

public class NumberException {

	public static void main(String[] args) {
		String a = "30a";
		String b = "60b";
		try {
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			int z = x + y;
			System.out.println("sum= " + z);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Integer");
		}

	}

}
