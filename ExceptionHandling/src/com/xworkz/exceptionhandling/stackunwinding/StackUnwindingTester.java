package com.xworkz.exceptionhandling.stackunwinding;

public class StackUnwindingTester {

	public static void main(String[] args) {
		System.out.println("Program begin");
		StackUnwindingExample ref=new StackUnwindingExample();
		ref.method1();
		System.out.println("Ending program");

	}

}
