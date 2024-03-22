package com.spring.auto;

import org.springframework.stereotype.Component;

@Component("squareShape")
public class Square implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("Area of a square " + (x*x));
	}
	
}
