package com.example.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
	
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	@Autowired
	IFoodMenu menus;
	
	IFoodMenu menuItems;
	public void setMenu(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}


	public List<String> viewMenus(String choice) {
		List<String> menusList = new ArrayList<>();
		if(choice.equals("i")) 
			menusList =  iFoodMenu.showMenu();
		if(choice.equals("m")) 
			menusList =  menus.showMenu();
		if(choice.equals("c")) 
			menusList =  menus.showMenu();
		return menusList;
	}
	
}
