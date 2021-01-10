package com.xworkz.exceptionhandling.stackunwinding;

public class StackUnwindingExample {
	
	void method1(){
		System.out.println("Inside method1");
		method2();
		System.out.println("Ending method1");		
	}
	void method2(){
		System.out.println("Inside method2");
		method3();
		System.out.println("Ending method2");	
	}
	void method3(){
		System.out.println("Inside method3");
		int a=10,b=0;
		int div=a/b;//Exception
		System.out.println("Div value is: "+div);
		System.out.println("Ending method1");
	}
}
