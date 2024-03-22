package com.voya.training;

import java.util.*;

public class Resigtration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name to register: ");
		String checkUser = sc.nextLine();
		boolean isPresent = false;
		String[] usernames = { "bhargav", "bhagya", "ajay" };
		
		for (String user : usernames) {
			if (user.equals(checkUser)) {
				isPresent = true;
			}
		}

		if (!isPresent)
			System.out.println("You are registered.");
		else
			System.out.println("Name is not unique.");
		sc.close();
	}

//	public static boolean checkUser(String newUser) {
//		
//	}

}
