package com.demo.java_learning;

import java.util.Scanner;

public class FindLowerAndUpperLetterUsingAciiValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Char : ");
		char variable = scanner.next().charAt(0);

		int ascii = (int) variable;
		System.out.println(ascii);
		if (ascii >= 65 && ascii <= 96) {
			System.out.println("upper case: " + variable);

		} else if (ascii >= 97 && ascii <= 123) {
			System.out.println("Lower case: " + variable);
		}

		String str = "manjula";
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
	}

}
