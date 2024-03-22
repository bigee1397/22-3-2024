package com.assignments.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assignments.setter.Vehicle;

public class InstrumentApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext("com.assignments.constructor");
		
		Performer performer = (Performer) appContext.getBean(Performer.class);
		performer.playMusic("v", "\"Violin\" from Idarammalytho");
		performer.playMusic("g", "\"Nina Pooje Ge Bande\" by Raghu Dixit");
		performer.playMusic("k", "\"Prema Vennela\" from Chitralahari");
	}
}