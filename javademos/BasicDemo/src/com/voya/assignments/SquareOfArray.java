package com.voya.assignments;

import java.util.Scanner;

public class SquareOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		int[] squaredNumbers = new int[size];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			squaredNumbers[i] = numbers[i] * numbers[i];
		}
		
		System.out.println("Squared Numbers Array is: ");
		for (int number : squaredNumbers) {
			System.out.print(number + " ");
		}
		sc.close();
	}
	
}
