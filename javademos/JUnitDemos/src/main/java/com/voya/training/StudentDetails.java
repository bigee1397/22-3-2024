package com.voya.training;

import com.voya.exceptions.InvalidNumException;

public class StudentDetails {
	public int totalMarks(int mark1, int mark2, int mark3) {
		if(mark1<0 || mark2<0 || mark3<0) 
			throw new InvalidNumException("Negative numbers entered as marks.");
		if(mark1>100 || mark2>100 || mark3>100) 
			throw new InvalidNumException("Marks entered is greater than 100.");
		return mark1+mark2+mark3;
	}
}
