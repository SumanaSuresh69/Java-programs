package com.xworkz.abstraction.interfaceconcept;

public class TVRemote implements Remote {

	@Override
	public void poweron() {
		System.out.println("TV is powered on");

	}

	@Override
	public void poweroff() {
		System.out.println("TV is powered off");

	}

}
