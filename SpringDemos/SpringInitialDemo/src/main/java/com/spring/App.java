package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.setter.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext("com.spring");
		Employee employee = (Employee) appCon.getBean("employee");
		System.out.println(employee);
		Employee employee1 = appCon.getBean("employee", Employee.class);
		System.out.println(employee1);
		Employee employee2 = appCon.getBean(Employee.class);
		System.out.println(employee2);
	}
}
