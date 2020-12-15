package com.xworkz.memorymanagement;

public class FindingAreaOfCircle {
	public static void main(String[] args) {
		System.out.println("program to find area of circle");

		FindingAreaOfCircle findthearea = new FindingAreaOfCircle();

		double result = findthearea.findarea(9);

		System.out.println("Area of the circle with radius 9 is: " + result);

		System.out.println("program ended");

	}

	double findarea(int radius) {
		// c = pi*radius*radius
		double area;
		double pi = findpi(); // method calling
		System.out.println("value of pi is: " + pi);
		area = pi * radius * radius;
		return area;
	}

	double findpi() {
		double pi = 22d / 7d;
		return pi;

	}
}