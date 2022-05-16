package com.demo.java_learning;

import java.util.Scanner;
//Display Sum of n Natural Numbers ,n should be taken from console .

public class DisplaySumOfNaturalGetInputFromConsol {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  Natural number:");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
			System.out.print(" " + i);

		}
		System.out.println("\n sum of n natural number is :" + sum);
	}

}
