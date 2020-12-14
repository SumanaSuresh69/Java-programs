package com.xworkz.accessmodifier.publicmodifier;

public class Dolls {
	public String material;
	public String color;

	public Dolls(String inMaterial, String inColor) {
		material = inMaterial;
		color = inColor;
	}

	public void playing() {
		System.out.println("Playing with dolls");
	}
}
