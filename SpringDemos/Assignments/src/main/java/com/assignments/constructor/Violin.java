package com.assignments.constructor;
import org.springframework.stereotype.Component;

@Component
public class Violin implements IInstrument {
	@Override
	public void play(String song) {
		System.out.println("Playing " + song + " from the Violin class.");
	}
}
