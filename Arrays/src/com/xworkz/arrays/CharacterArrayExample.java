package com.xworkz.arrays;

public class CharacterArrayExample {

	public static void main(String[] args) {
		char[] charArray = { 'A', 'D', 'R', 'T', 'V', 'X' };
		System.out.println("First Element: " + charArray[0]);
		int leng = charArray.length;
		System.out.println("Length: " + charArray.length);
		System.out.println("Last Element: " + charArray[leng - 1]);

		System.out.println("Traversing using for loop: ");
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Element is: " + charArray[i]);
		}
	}
}
