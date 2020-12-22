package com.xworkz.inheritance;

public class AndroidTester {

	public static void main(String[] args) {
		// inheritance
		AndroidKitkat kitkat = new AndroidKitkat();
		// member from parent class
		kitkat.version = 10;
		kitkat.cameraPixel = 16;

		kitkat.displayDetails();
		kitkat.calling();
		kitkat.gaming();

		// member from child class
		kitkat.hasFaceLock = true;
		System.out.println("Has facelock: " + kitkat.hasFaceLock);
		kitkat.removeBoldClock();

		AndroidJellyBean jellyBean = new AndroidJellyBean();
		jellyBean.version = 4.0;
		jellyBean.cameraPixel = 10;
		jellyBean.displayDetails();
		jellyBean.calling();
		jellyBean.gaming();

		// jellyBean.hasFaceLock // not possible coz AndroidJellyBean is an independent class

	}

}
