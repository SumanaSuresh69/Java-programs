package com.xworkz.arrays;

public class DiscoverMain {

	public static void main(String[] args) {
		int length = args.length;
		System.out.println("Length of array: " + length);

		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.println("Element: " + args[i]);
			}
		} else {
			System.out.println("Dont receive any arg");
		}
	}
}
