package com.example.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	 Chinese getChinese() {
		return new Chinese();
	}
	
	@Bean
	 Indian getIndian() {
		return new Indian();
	}
	
	@Bean
	@Primary
	 Mexican getMexican() {
		return new Mexican();
	}
	
	@Bean
	 Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setMenu(getChinese());
		return waiter;
	}
	
}
