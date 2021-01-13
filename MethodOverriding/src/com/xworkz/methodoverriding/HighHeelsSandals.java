package com.xworkz.methodoverriding;

public class HighHeelsSandals extends Sandals {
	boolean highCost;

	public HighHeelsSandals(String color, String brand, double price, boolean highCost) {
		super(color, brand, price);
		this.highCost = highCost;
	}

	@Override
	void walking() {
		System.out.println("Walking on road with high heels");
	}

}
