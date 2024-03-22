package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.constructor.Student;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext appCont = new AnnotationConfigApplicationContext("com.spring.constructor");
		Student student = (Student) appCont.getBean("student");
		System.out.println(student);
	}
}
