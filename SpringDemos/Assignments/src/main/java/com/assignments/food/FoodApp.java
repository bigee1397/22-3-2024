package com.assignments.food;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assignments.food.*;

public class FoodApp {
	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext("com.assignments.food");
		Waiter waiter = appCon.getBean(Waiter.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want to eat, INDIAN \"i\", CHINESE \"c\", Mexican \"m\": ");
		String choice = sc.next();
		List<String> menus = waiter.viewMenus(choice);
		for (String menu : menus) {
			System.out.print(menu + " ");
		}
	}
}
