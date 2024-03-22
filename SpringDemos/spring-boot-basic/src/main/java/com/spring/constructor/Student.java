package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	
	@Value("${student.studName}")
	private String studName;
	@Value("${student.department}")
	private String department;
	private Course course;

	public Student(Course course) {
		super();
		this.course = course;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", department=" + department + ", course=" + course + "]";
	}

}