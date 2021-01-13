package com.xworkz.methodoverriding;

public class StoryBook extends Book {
	boolean morePictures;

	public StoryBook(int numOfPages, String brand, double price, String size,boolean morePictures) {
		super(numOfPages, brand, price, size);
		this.morePictures = morePictures;
	}

	@Override
	void reading() {
		System.out.println("reading a story book");
	}

}
