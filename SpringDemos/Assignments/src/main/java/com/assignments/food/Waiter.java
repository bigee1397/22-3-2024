package com.assignments.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	
	@Autowired
	@Qualifier("chinese")
	IFoodMenu foodMenu;
	
	@Autowired
	IFoodMenu indian;
	
	IFoodMenu mexican;
	public Waiter(IFoodMenu mexican) {
		super();
		this.mexican = mexican;
	}


	List<String> viewMenus(String choice) {
		List<String> menus = new ArrayList<>();
		
		if(choice.equals("c")) 
			menus =  foodMenu.showMenu();
		if(choice.equals("i")) 
			menus =  indian.showMenu();
		if(choice.equals("m")) 
			menus =  mexican.showMenu();
		return menus;
	}
	
}
