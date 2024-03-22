package com.voya.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name to register: ");
		String checkUser = sc.nextLine();
		boolean isPresent = false;
		String loggedInUser = "";
		String[] usernames = { "bhargav", "bhagya", "ajay" };
		
		for (String user : usernames) {
			if (user.equals(checkUser)) {
				isPresent = true;
				loggedInUser = user;
			}
		}

		if (!isPresent)
			System.out.println("Please register yourself and then try to login!!😒.");
		else
			System.out.println("Welcome!!! " + loggedInUser);
		sc.close();

	}

}
