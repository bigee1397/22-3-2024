package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShapeApp {
	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext("com.spring.auto");
		ShapeFactory shapeFactory = appCon.getBean(ShapeFactory.class);
		shapeFactory.printArea("r",5, 6);
		
		shapeFactory.printArea("t",5, 6);
		
		shapeFactory.printArea("s",5, 6);
	}	
}
