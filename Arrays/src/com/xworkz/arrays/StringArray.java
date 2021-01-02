package com.xworkz.arrays;

public class StringArray {

	public static void main(String[] args) {
		String names[] = new String[4];
		names[0] = "Sumana";
		names[1] = "Supriya";
		names[2] = "Suresh";
		names[3] = "Sunitha";

		StringArray strarr = new StringArray();
		strarr.PrintArray(names);
	}

	void PrintArray(String[] arr) {
		System.out.println("Print values of array");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element: " + arr[i]);
		}
	}

}
