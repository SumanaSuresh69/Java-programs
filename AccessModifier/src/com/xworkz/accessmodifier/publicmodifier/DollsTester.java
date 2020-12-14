package com.xworkz.accessmodifier.publicmodifier;

import com.xworkz.accessmodifier.publicmodifier.Dolls;

public class DollsTester {

	public static void main(String[] args) {
		Dolls dolls = new Dolls("Iron", "red");
		dolls.material = "Wood";
		dolls.color = "White";
		dolls.playing();
	}

}
