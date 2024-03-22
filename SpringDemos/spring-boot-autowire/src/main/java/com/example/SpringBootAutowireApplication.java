package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.auto.ShapeFactory;
import com.example.food.Waiter;

@SpringBootApplication
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}

	
	@Autowired
	ShapeFactory shapeFactory;
	
	@Autowired
	Waiter waiter;
	
	
	@Override
	public void run(String... args) throws Exception {
		shapeFactory.printArea("s", 4,5);
		System.out.println();
		List<String> menus = waiter.viewMenus("i");
		for (String menu : menus) {
			System.out.println(menu);
		}
	}

}
