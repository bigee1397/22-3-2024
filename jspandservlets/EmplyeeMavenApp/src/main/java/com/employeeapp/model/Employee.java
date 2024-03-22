package com.employeeapp.model;

public class Employee {
	private Integer emlpoyeeId;
//	private String employeeName, employeeCity, employeeCourse;
	private String employeeName, employeeCity;
	private double employeeSalary;
	
	public Employee() {
		super();
	}
//	public Employee(Integer emlpoyeeId, String employeeName, String employeeCity, String employeeCourse,
//			double employeeSalary) {
		public Employee(Integer emlpoyeeId, String employeeName, String employeeCity, String employeeCourse,
				double employeeSalary) {
		super();
		this.emlpoyeeId = emlpoyeeId;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
//		this.employeeCourse = employeeCourse;
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmlpoyeeId() {
		return emlpoyeeId;
	}
	public void setEmlpoyeeId(Integer emlpoyeeId) {
		this.emlpoyeeId = emlpoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
//	public String getEmployeeCourse() {
//		return employeeCourse;
//	}
//	public void setEmployeeCourse(String employeeCourse) {
//		this.employeeCourse = employeeCourse;
//	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [emlpoyeeId=" + emlpoyeeId + ", employeeName=" + employeeName + ", employeeCity="
				+ employeeCity + ", employeeSalary=" + employeeSalary + "]";
	}
	
	
}
