package com.demo.java_learning;
import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among them.
public class FindWhoIsGreaterAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Person Age1:");
		int Age1 = input.nextInt();
		System.out.println("Enter Person Age2:");
		int Age2 = input.nextInt();
		System.out.println("Enter Person  Age3:");
		int Age3 = input.nextInt();
		
		//Calling method
		findOldestAndYongestPerson(Age1,Age2,Age3);

	}

	public static void findOldestAndYongestPerson(int Age1, int Age2, int Age3) {
		if ((Age1 > Age2) && (Age1 > Age3)) {
			System.out.println("Person Age1 is the Oldest Person: " +Age1);
		} else if (Age2 >Age3) {
			System.out.println("Person Age2 is the oldest Person: " + Age2);

		} else {
			System.out.println("Person Age3 is the oldest Person: " + Age3);
		}
		
		if ((Age1 < Age2) && (Age1 < Age3)) {
			System.out.println("Person Age1 is the Youngest Person: " +Age1);
		} else if (Age2 < Age3) {
			System.out.println("Person Age2 is the Youngest Person: " + Age2);

		} else {
			System.out.println("Person Age3 is the Youngest Person: " + Age3);
		}	
		
	}

}
