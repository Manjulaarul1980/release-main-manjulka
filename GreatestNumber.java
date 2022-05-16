package com.demo.java_learning;
import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1 = input.nextInt();

		System.out.println("Enter the Second Number : ");
		int number2 = input.nextInt();
		
		
		findGreatest(number1,number2);// Method called
	}

	public static void findGreatest(int number1, int number2) {
		if (number1 > number2) {
			System.out.println(number1 + " is the greatest number");
		} else {
			System.out.println(number2 + " is the greatest number");
		}
	}
}