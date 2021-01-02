package com.xworkz.arrays;

public class StringArrayExample {

	public static void main(String[] args) {
		String arrString[]; // Array declaration
		arrString = new String[5]; // Array initialization
		arrString[0] = "This";
		arrString[1] = "is";
		arrString[2] = "a";
		arrString[3] = "string";
		arrString[4] = "array";
		// arrString[5]=25;//Exception in thread "main" //array index out of bound

		System.out.println("First Element: " + arrString[0]);
		int leng = arrString.length;
		System.out.println("Length: " + leng);
		System.out.println("Last Element: " + arrString[leng - 1]);

		System.out.println("Traversing using for loop: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Element is: " + arrString[i]);
		}

	}

}
