package com.voya.assignments;

import java.util.Scanner;

public class SumAverageArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		
		int size = sc.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Enter the array elements: ");
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			sum = sum +numbers[i];
		}
		
		System.out.print("The sum of array is: " + sum);
		System.out.println("The average of array is: " + sum/size);
		sc.close();
	}
	
}
