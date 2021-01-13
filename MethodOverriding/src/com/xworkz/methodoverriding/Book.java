package com.xworkz.methodoverriding;

public class Book {
	int numOfPages;
	String brand;
	double price;
	String size;

	public Book(int numOfPages, String brand, double price, String size) {
		super();
		this.numOfPages = numOfPages;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	void reading() {
		System.out.println("Reading a book");
	}

}
