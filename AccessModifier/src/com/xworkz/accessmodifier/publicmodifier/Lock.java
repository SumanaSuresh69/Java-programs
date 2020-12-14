package com.xworkz.accessmodifier.publicmodifier;

public class Lock {
	public String material;
	public String shape;

	public Lock(String inMaterial, String inShape) {
		material = inMaterial;
		shape = inShape;
	}

	public void locking() {
		System.out.println("Locking");
	}

}
