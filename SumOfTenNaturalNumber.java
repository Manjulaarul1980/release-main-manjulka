package com.demo.java_learning;

//1.Write a program to calculate the sum of first 10 natural number.

public class SumOfTenNaturalNumber {

	public static void main(String[] args) {

		int number, sum = 0;

		System.out.println("The first 10 natural number is :");

		for (number = 1; number <= 10; number++) {
			sum = sum + number;
			System.out.print("  " + number);

		}
		System.out.println("\nsum of natural number is: " + sum);
	}
}
