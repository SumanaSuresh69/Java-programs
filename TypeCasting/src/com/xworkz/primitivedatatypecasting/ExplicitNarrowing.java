package com.xworkz.primitivedatatypecasting;

public class ExplicitNarrowing {

	public static void main(String[] args) {
		double d= 156987.14753027353729;
		System.out.println("Double value is: "+ d);
		
		float f= (float)d;
		System.out.println("Float value is: "+ f);
		
		long l= (long)f;
		System.out.println("Long value is: "+ l);
		
		int i= (int)l;
		System.out.println("Int value is: "+ i);
		
		short s= (short)i;
		System.out.println("Short value is: "+ s);

		byte b= (byte)s;
		System.out.println("Byte value is: "+ b);

	}

}

//Output:
//	Float value is: 156987.14
//	Long value is: 156987
//	Int value is: 156987
//	Short value is: 25915
//	Byte value is: 59

