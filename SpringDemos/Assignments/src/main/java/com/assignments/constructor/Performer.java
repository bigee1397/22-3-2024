package com.assignments.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	
	@Autowired
	@Qualifier("violin")
	IInstrument instrument;
	
	@Autowired
	IInstrument guitar;
	
	
	@Autowired
	IInstrument keyboard;
	public Performer(IInstrument keyboard) {
		super();
		this.keyboard = keyboard;
	}

	void playMusic(String choice, String song) {
		if(choice.equals("v"))
			instrument.play(song);
		if(choice.equals("g"))
			guitar.play(song);
		if(choice.equals("k"))
			keyboard.play(song);
	}
	
}