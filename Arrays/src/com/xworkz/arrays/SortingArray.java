package com.xworkz.arrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int count, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements you want in array: ");
		count = scan.nextInt();

		int num[] = new int[count];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++)
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}

		System.out.print("Array elements in ascending order: ");
		for (int i = 0; i < count-1; i++) {
			System.out.print(num[i] + ", ");

		}
		System.out.print(num[count - 1]);

	}
}

//enter number of elements you want in array:5
//enter array elements:45,12,78,34,89
//Array elements in ascending order:12,34,45,78,89
