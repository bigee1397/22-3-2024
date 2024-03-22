package com.assignments.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext("com.assignments.setter");
		Vehicle vehicle = appContext.getBean(Vehicle.class);
		System.out.println(vehicle);
	}
}