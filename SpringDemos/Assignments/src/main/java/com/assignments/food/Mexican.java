package com.assignments.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("mexican")
public class Mexican implements IFoodMenu{
	@Override
	public List<String> showMenu() {
		return Arrays.asList("Quessidilla","Tacos", "Nachos");
	}
}