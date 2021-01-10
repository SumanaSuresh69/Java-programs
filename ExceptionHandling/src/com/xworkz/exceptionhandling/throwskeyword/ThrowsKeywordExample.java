package com.xworkz.exceptionhandling.throwskeyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordExample {
	
	void division(int a,int b) {
		System.out.println("inside method division");
		//division
		int div=a/b;
		System.out.println("The result of " + a + "/"+b+"=" + div);
		System.out.println("End of division method");
		}
	
	void accessFile() throws FileNotFoundException{
		//File handling
		File f = new File("C:\\FileIOExample\\sample.txt");
		FileReader reader = new FileReader(f);
	}

	public static void main(String[] args) {
		ThrowsKeywordExample inst = new ThrowsKeywordExample();
		inst.division(10, 0);
		try {
			inst.accessFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}

	}

}
