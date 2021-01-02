package com.xworkz.arrays.customobjectarray;

public class DollTester {

	public static void main(String[] args) {

		Doll barbie = new Doll("skin", "small", 200.00);
		Doll teddybear = new Doll("brown", "large", 400.00);
		Doll car = new Doll("Red", "small", 50.00);

		Doll[] dollsArray = new Doll[5];
		dollsArray[0] = barbie;
		dollsArray[1] = teddybear;
		dollsArray[4] = car;
		
		Doll tempdoll=dollsArray[0];
		System.out.println("Values in first element: ");
		tempdoll.displayDoll();

		System.out.println("All the elements are: ");
		for (int i = 0; i < dollsArray.length; i++) {
			Doll temp=dollsArray[i];//index=2//temp=null
			if(temp!=null)
				temp.displayDoll();
			else
			    System.out.println("null");
		}

	}

}
