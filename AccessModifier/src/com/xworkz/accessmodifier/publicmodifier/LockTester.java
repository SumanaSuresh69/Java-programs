package com.xworkz.accessmodifier.publicmodifier;

import com.xworkz.accessmodifier.publicmodifier.Lock;

public class LockTester {

	public static void main(String[] args) {
		Lock lock = new Lock("Iron", "Round");
		lock.material = "Steel";
		lock.shape = "Square";
		lock.locking();
	}

}
