package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter id: ");		
		Integer id = sc.nextInt();
		System.out.println("Enter city: ");
		sc.nextLine();
		String city = sc.nextLine();
		System.out.println("Enter salary: ");
		Double salary = sc.nextDouble();
		
		System.out.println("Emp Name is: " + name);
		System.out.println("Emp ID is: " + id);
		System.out.println("Emp City is: " + city);
		System.out.println("Emp salary is: " + salary);
		sc.close();
	}

}
