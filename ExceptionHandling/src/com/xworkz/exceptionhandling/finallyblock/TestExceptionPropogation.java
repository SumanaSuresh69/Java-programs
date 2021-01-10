package com.xworkz.exceptionhandling.finallyblock;

public class TestExceptionPropogation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		TestExceptionPropogation ref = new TestExceptionPropogation();
		ref.p();
		System.out.println("normal flow...");

	}

}
