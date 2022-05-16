package com.demo.java_learning;

import java.util.Scanner;

/*4.Write a program to find the factorial value of any number 
entered through the keyboard. (The factorial of a number is the number that 
multiplies the number by every natural number So n! or "n factorial"
means: n! = 1. 2. 3…………………………………n =  */

public class FactorialOfNnumbers {

	public static void main(String[] args) {
		long number, fact = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");

		number = sc.nextLong();
	public static long factorial(long number)
		   {
		       
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
			
		      return fact;
		   }
		}

		
		}
		System.out.println("facttorial of " +number+ " is : " + fact);
	}

}
