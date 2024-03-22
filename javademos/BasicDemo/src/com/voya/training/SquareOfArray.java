package com.voya.training;

import java.util.Scanner;

public class SquareOfArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		int[] squareNumbers = new int[size];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			int number = numbers[i];
			squareNumbers[i] = number * number;
		}
		
		System.out.println("The array with square values");
		for(int squareNumber : squareNumbers) System.out.print(squareNumber + " ");
		sc.close();
	}
}
