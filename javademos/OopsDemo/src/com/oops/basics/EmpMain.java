package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.empName = "Raja";
		employee.empId = 203045;
		employee.empSalary = 20000;
		System.out.println("Name " + employee.empName);
		System.out.println("Id " + employee.empId);
		System.out.println("Salary " + employee.empSalary);

		Employee employee1 = new Employee();

		employee1.empName = "Saroja";
		employee1.empId = 2054025;
		employee1.empSalary = 22000;
		System.out.println("Emp1 Name " + employee1.empName);
		System.out.println("Id " + employee1.empId);
		System.out.println("Salary " + employee1.empSalary);

	}
}
