package com.xworkz.exceptionhandling.finallyblock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		// file handling
		File f = new File("C:\\FileIOExample\\sample.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(f);//compile time exception
		}catch(FileNotFoundException e) {
			System.out.println("The file was not found");
		}finally {
			System.out.println("Some statements to be executed");
			//reader.close();
		}
		

	}

}
