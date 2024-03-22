package com.assignments.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu{
	@Override
	public List<String> showMenu() {
		return Arrays.asList("Manchurian","Noodles", "Chow Mein");
	}
}