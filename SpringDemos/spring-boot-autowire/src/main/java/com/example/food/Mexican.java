package com.example.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


public class Mexican implements IFoodMenu{
	@Override
	public List<String> showMenu() {
		return Arrays.asList("Quessidilla","Tacos", "Nachos");
	}
}