package com.xworkz.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] twoDimenArray = new int[2][];

		twoDimenArray[0] = new int[3];
		twoDimenArray[1] = new int[4];

		int counter = 0;
		for (int i = 0; i < twoDimenArray.length; i++) {
			for (int j = 0; j < twoDimenArray[i].length; j++) {
				twoDimenArray[i][j] = counter++;
			}
		}
		for (int i = 0; i < twoDimenArray.length; i++) {
			System.out.println();
			for (int j = 0; j < twoDimenArray[i].length; j++) {
				System.out.print(twoDimenArray[i][j]);
			}
		}

	}

}

//012
//3456
