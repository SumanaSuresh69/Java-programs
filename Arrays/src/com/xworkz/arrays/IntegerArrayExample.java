package com.xworkz.arrays;

public class IntegerArrayExample {

	public static void main(String[] args) {

		int arr[]; // Array declaration
		arr = new int[5]; // Array initialization
		arr[0] = 4;
		arr[1] = 9;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 21;
		// arr[5]=25;//Exception in thread "main" //array index out of bound

		System.out.println("First Element: " + arr[0]);
		int leng = arr.length;
		System.out.println("Length: " + leng);
		System.out.println("Last Element: " + arr[leng - 1]);

		System.out.println("Traversing using for loop: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Element is: " + arr[i]);
		}

	}
}
