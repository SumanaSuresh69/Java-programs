package com.xworkz.memorymanagement;

public class FindingCircumferenceOfCircle {

	public static void main(String[] args) {
		System.out.println("program to find circumference of circle");
		
		FindingCircumferenceOfCircle findcircum = new FindingCircumferenceOfCircle();
		
		double result = findcircum.findcircumference(5);
		
		System.out.println("Circumference of the circle with radius 5 is: " + result);
		
		System.out.println("program ended");

	}

	double findcircumference(int radius) {
		// c = 2*pi*radius
		double circumference;
		double pi = findpi(); // method calling
		System.out.println("value of pi is: " + pi);
		circumference = 2 * pi * radius;
		return circumference;
	}

	double findpi() {
		double pi = 22.00 / 7.00;
		return pi;
	}

}
