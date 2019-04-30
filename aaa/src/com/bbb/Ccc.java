package com.bbb;

import java.util.Scanner;

public class Ccc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	try {
		System.out.print("Please enter Math score: ");
		int math = Integer.parseInt(scanner.nextLine());
		if(math < 0 || math > 100) {
			throw new Exception();
		}
		System.out.print("Please enter english score: ");
		int english = Integer.parseInt(scanner.nextLine());
		if(english < 0 || english > 100) {
			throw new NumberFormatException();
		}
		System.out.println((math+english)/2);
	}
	catch(Exception e) {
		System.out.println("½Ð¿é¼Æ¦r");
		return;
	}
		
}
}