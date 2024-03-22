package com.assignments.constructor;
import org.springframework.stereotype.Component;

@Component("keyboard")
public class Keyboard implements IInstrument {
	@Override
	public void play(String song) {
		System.out.println("Playing " + song + " from the Keyboard class.");
	}
}
