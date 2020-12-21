package com.xworkz.inheritance.parents;

public class ParentChildTester {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.tallHeight = 5.8;
		child.longNose = 3;
		child.longFoot = 4;

		child.displayDetails();
		child.property();
		child.singing();
		child.drawing();

		child.longFingers = true;
		System.out.println("Has long fingers: " + child.longFingers);

	}

}
