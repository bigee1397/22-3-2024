package com.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
//	Autowiring by type
	
	@Autowired
	@Qualifier("rectangle")
	IShape shape;

//	Autowiring by name
	
	@Autowired
	IShape triangle;

//	Autowiring by constructor
	
	private IShape squareShape;

	public ShapeFactory(IShape squareShape) {
		super();
		this.squareShape = squareShape;
	}

	void printArea(String choice, int a, int b) {
		System.out.println("Printing area");
		if (choice.equals("r"))
			shape.area(a, b);
		if (choice.equals("t"))
			triangle.area(a, b);
		if (choice.equals("s"))
			squareShape.area(a, b);
	}

}
