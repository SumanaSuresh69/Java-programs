package com.xworkz.abstraction.interfaceconcept;

public class RemoteTester {

	public static void main(String[] args) {
		Remote tvremote = new TVRemote();// upcasting
		tvremote.poweron();
		tvremote.poweroff();

		Remote acremote = new ACRemote();
		acremote.poweron();
		acremote.poweroff();

	}

}
