package com.xworkz.arrays;

public class DoubleArrayExample {

	public static void main(String[] args) {
		String[][] array ={
				{ "Mr.", "Mrs.", "Ms."},
				{"Sumana"}
		};
		System.out.println("First Element: " + array[0][0]);
		System.out.println("Length: " + array.length);
		System.out.println("Last Element: " + array[1][0]);
		
		//Mrs.Sumana
		System.out.println(array[0][1] + array[1][0]);
		//Mr.Sumana
		System.out.println(array[0][2] + array[1][0]);
	}
}
