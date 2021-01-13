package com.xworkz.primitivedatatypecasting;

public class AutoWidening {

	public static void main(String[] args) {
		byte b=10;
		System.out.println("Byte value is: "+ b);
		
		short s=b; //autowidening
		System.out.println("Short value is: "+ s);
		
		int i=s;
		System.out.println("Int value is: "+ i);
		
		long l=i;
		System.out.println("Long value is: "+ l);
		
		float f=l;
		System.out.println("Float value is: "+ f);
		
		double d=f;
		System.out.println("Double value is: "+ d);
	}

}

//Output:
//	Short value is: 10
//	Int value is: 10
//	Long value is: 10
//	Float value is: 10.0
//	Double value is: 10.0

