package com.assignments.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Indian implements IFoodMenu{
	@Override
	public List<String> showMenu() {
		return Arrays.asList("Dosa","Idli", "Rice and Sambar");
	}
}