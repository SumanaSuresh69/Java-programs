package com.xworkz.blocks;

public class InitializationBlock {
	{
		// Initialization block
		System.out.println("This Initialization block");
	}

	InitializationBlock() {
		System.out.println("No-arg constructor");
	}

	InitializationBlock(int a, int b) {
		System.out.println("In parameterized constructor");
	}
}
