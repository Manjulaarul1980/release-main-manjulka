package com.demo.java_learning;

import java.util.Scanner;

public class FindSquareOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length number:");
		int length = input.nextInt();

		System.out.println("Enter the breath Number : ");
		int width = input.nextInt();
		
		findingAreaOfRectangle(length, width);
		
	}
	public static void findingAreaOfRectangle(int length , int width) {
		
		//int area = length * width;
		//System.out.println(" Area of Rectangle:" + area);
		
		if(length == width) {
			System.out.println("it is square");
		}else {
			System.out.println(" it is Rectangle");
		}
	    
	
		
	}

}
