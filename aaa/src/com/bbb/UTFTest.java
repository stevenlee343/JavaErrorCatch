package com.bbb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UTFTest {

	public static void main(String[] args) {
		
		File file = new File("C:\\cygwin");
		
		if(file.exists() && file.isDirectory()){
			
		String[] files = file.list();
		for(String s: files) {
			System.out.println(s);
		}
		System.out.println(file.mkdir());
		File aa = new File(file, "avc");
		System.out.println(aa.mkdir());
		
		}
		 
	}
}


