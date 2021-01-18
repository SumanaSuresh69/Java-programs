package com.xworkz.abstraction.interfaceconcept;

public class ACRemote implements Remote {

	@Override
	public void poweron() {
		System.out.println("AC is powered on");

	}

	@Override
	public void poweroff() {
		System.out.println("AC is powered off");

	}

}
