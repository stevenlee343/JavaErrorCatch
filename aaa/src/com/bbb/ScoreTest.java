package com.bbb;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	try {
		System.out.print("Please enter Math score: ");
		Score math = new Score(scanner.nextLine());
		
		System.out.print("Please enter english score: ");
		int english = Integer.parseInt(scanner.nextLine());
		
		System.out.println((math.value + english)/2);
	}
	catch(NumberFormatException e) {
		System.out.println("½Ð¿é¼Æ¦r");
		e.printStackTrace();
		}
	}
}