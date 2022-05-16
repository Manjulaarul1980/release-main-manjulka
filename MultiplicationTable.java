package com.demo.java_learning;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the your choice of Multiplication table : ");
		int multiply = input.nextInt();
		multiplicationTable(multiply);

	}

	public static void multiplicationTable(int multiply) {
		for (int i = 0; i <= 12; ++i) {
			System.out.println(multiply + " * " + i + " = " + multiply * i);
		}
	}
}
